package com.baidu.mapapi.http.wrapper;

import android.text.TextUtils;
import cn.hutool.core.util.l;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.DELETE;
import com.baidu.mapapi.http.wrapper.annotation.FileParam;
import com.baidu.mapapi.http.wrapper.annotation.GET;
import com.baidu.mapapi.http.wrapper.annotation.HttpHeader;
import com.baidu.mapapi.http.wrapper.annotation.POST;
import com.baidu.mapapi.http.wrapper.annotation.PUT;
import com.baidu.mapapi.http.wrapper.annotation.QueryString;
import com.google.common.net.HttpHeaders;
import com.yanzhenjie.kalle.i;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class HttpManager {
    public static final String HTTP_DELETE = "DELETE";
    public static final String HTTP_GET = "GET";
    public static final String HTTP_POST = "POST";
    public static final String HTTP_PUT = "PUT";

    /* renamed from: a, reason: collision with root package name */
    private String f5490a;

    /* renamed from: b, reason: collision with root package name */
    private String f5491b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f5492c;

    class a implements InvocationHandler {

        /* renamed from: com.baidu.mapapi.http.wrapper.HttpManager$a$a, reason: collision with other inner class name */
        class RunnableC0059a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HttpClient f5494a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f5495b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f5496c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f5497d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Map f5498e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Class f5499f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ AsyncResponse f5500g;

            RunnableC0059a(HttpClient httpClient, String str, String str2, String str3, Map map, Class cls, AsyncResponse asyncResponse) {
                this.f5494a = httpClient;
                this.f5495b = str;
                this.f5496c = str2;
                this.f5497d = str3;
                this.f5498e = map;
                this.f5499f = cls;
                this.f5500g = asyncResponse;
            }

            @Override // java.lang.Runnable
            public void run() {
                HttpClient.HttpResponse request = this.f5494a.request(this.f5495b, this.f5496c, this.f5497d, this.f5498e);
                if (request.getError() != HttpClient.HttpStateError.NO_ERROR) {
                    this.f5500g.a(new Throwable(request.getError().toString()));
                    return;
                }
                try {
                    if (this.f5499f != null) {
                        this.f5500g.a((AsyncResponse) ParamsUtils.toObject(request.getData(), this.f5499f));
                    } else {
                        this.f5500g.a((AsyncResponse) null);
                    }
                } catch (Exception e8) {
                    this.f5500g.a((Throwable) e8);
                }
            }
        }

        a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Class cls;
            HttpClient httpClient;
            String str;
            boolean z7;
            String str2;
            String str3;
            Annotation[] annotationArr;
            int i8;
            Iterator it;
            String str4;
            Class<?> returnType = method.getReturnType();
            if (returnType != AsyncResponse.class && returnType != Response.class) {
                return returnType.newInstance();
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            HashMap hashMap = new HashMap();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            String str5 = "";
            String str6 = "";
            for (int i9 = 0; i9 < objArr.length && i9 < parameterAnnotations.length; i9++) {
                Annotation[] annotationArr2 = parameterAnnotations[i9];
                int length = annotationArr2.length;
                int i10 = 0;
                while (i10 < length) {
                    Annotation annotation = annotationArr2[i10];
                    Annotation[][] annotationArr3 = parameterAnnotations;
                    if (annotation instanceof QueryString) {
                        arrayList.add(objArr[i9]);
                    }
                    if (annotation instanceof BodyData) {
                        String value = ((BodyData) annotation).value();
                        arrayList2.add(objArr[i9]);
                        str6 = value;
                    }
                    if (annotation instanceof HttpHeader) {
                        arrayList3.add(objArr[i9]);
                    }
                    if (annotation instanceof FileParam) {
                        FileParam fileParam = (FileParam) annotation;
                        str2 = str5;
                        if (fileParam.type() == 2) {
                            Iterator it2 = ((Map) objArr[i9]).entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                Iterator it3 = it2;
                                if (hashMap.containsKey(entry.getKey())) {
                                    str4 = str6;
                                } else {
                                    str4 = str6;
                                    hashMap.put(entry.getKey(), new ArrayList());
                                }
                                ((List) hashMap.get(entry.getKey())).add(new FileWrapper((File) entry.getValue()));
                                it2 = it3;
                                str6 = str4;
                            }
                        }
                        str3 = str6;
                        if (fileParam.type() == 3) {
                            Iterator it4 = ((Map) objArr[i9]).entrySet().iterator();
                            while (it4.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it4.next();
                                if (hashMap.containsKey(entry2.getKey())) {
                                    it = it4;
                                } else {
                                    it = it4;
                                    hashMap.put(entry2.getKey(), new ArrayList());
                                }
                                if (entry2.getValue() != null) {
                                    File[] fileArr = (File[]) entry2.getValue();
                                    int length2 = fileArr.length;
                                    Annotation[] annotationArr4 = annotationArr2;
                                    int i11 = 0;
                                    while (i11 < length2) {
                                        ((List) hashMap.get(entry2.getKey())).add(new FileWrapper(fileArr[i11]));
                                        i11++;
                                        length2 = length2;
                                        fileArr = fileArr;
                                        entry2 = entry2;
                                    }
                                    it4 = it;
                                    annotationArr2 = annotationArr4;
                                } else {
                                    it4 = it;
                                }
                            }
                        }
                        annotationArr = annotationArr2;
                        if (fileParam.type() == 6) {
                            for (Map.Entry entry3 : ((Map) objArr[i9]).entrySet()) {
                                if (!hashMap.containsKey(entry3.getKey())) {
                                    hashMap.put(entry3.getKey(), new ArrayList());
                                }
                                ((List) hashMap.get(entry3.getKey())).add(entry3.getValue());
                            }
                        }
                        if (fileParam.type() == 7) {
                            Iterator it5 = ((Map) objArr[i9]).entrySet().iterator();
                            while (it5.hasNext()) {
                                Map.Entry entry4 = (Map.Entry) it5.next();
                                if (!hashMap.containsKey(entry4.getKey())) {
                                    hashMap.put(entry4.getKey(), new ArrayList());
                                }
                                if (entry4.getValue() != null) {
                                    FileWrapper[] fileWrapperArr = (FileWrapper[]) entry4.getValue();
                                    int length3 = fileWrapperArr.length;
                                    Iterator it6 = it5;
                                    int i12 = 0;
                                    while (i12 < length3) {
                                        ((List) hashMap.get(entry4.getKey())).add(fileWrapperArr[i12]);
                                        i12++;
                                        length3 = length3;
                                        fileWrapperArr = fileWrapperArr;
                                    }
                                    it5 = it6;
                                }
                            }
                        }
                        String value2 = fileParam.value();
                        if (!TextUtils.isEmpty(value2)) {
                            if (!hashMap.containsKey(value2)) {
                                hashMap.put(value2, new ArrayList());
                            }
                            if (fileParam.type() == 0) {
                                ((List) hashMap.get(value2)).add(new FileWrapper((File) objArr[i9]));
                            }
                            if (fileParam.type() == 1) {
                                File[] fileArr2 = (File[]) objArr[i9];
                                int length4 = fileArr2.length;
                                int i13 = 0;
                                while (i13 < length4) {
                                    ((List) hashMap.get(value2)).add(new FileWrapper(fileArr2[i13]));
                                    i13++;
                                    length4 = length4;
                                    length = length;
                                    fileArr2 = fileArr2;
                                }
                            }
                            i8 = length;
                            if (fileParam.type() == 4) {
                                ((List) hashMap.get(value2)).add((FileWrapper) objArr[i9]);
                            }
                            if (fileParam.type() == 5) {
                                ((List) hashMap.get(value2)).addAll(Arrays.asList((FileWrapper[]) objArr[i9]));
                            }
                            i10++;
                            parameterAnnotations = annotationArr3;
                            str5 = str2;
                            str6 = str3;
                            annotationArr2 = annotationArr;
                            length = i8;
                        }
                    } else {
                        str2 = str5;
                        str3 = str6;
                        annotationArr = annotationArr2;
                    }
                    i8 = length;
                    i10++;
                    parameterAnnotations = annotationArr3;
                    str5 = str2;
                    str6 = str3;
                    annotationArr2 = annotationArr;
                    length = i8;
                }
            }
            String str7 = str5;
            Annotation[] annotations = method.getAnnotations();
            int length5 = annotations.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length5) {
                    cls = null;
                    httpClient = null;
                    str = str7;
                    z7 = true;
                    break;
                }
                Annotation annotation2 = annotations[i14];
                if (annotation2 instanceof GET) {
                    httpClient = new HttpClient(HttpManager.HTTP_GET);
                    GET get = (GET) annotation2;
                    str = get.value();
                    z7 = get.paramsNeedEncode();
                    cls = GET.class;
                    break;
                }
                if (annotation2 instanceof POST) {
                    httpClient = new HttpClient(HttpManager.HTTP_POST);
                    POST post = (POST) annotation2;
                    str = post.value();
                    z7 = post.paramsNeedEncode();
                    cls = POST.class;
                    break;
                }
                if (annotation2 instanceof PUT) {
                    httpClient = new HttpClient(HttpManager.HTTP_PUT);
                    PUT put = (PUT) annotation2;
                    str = put.value();
                    z7 = put.paramsNeedEncode();
                    cls = PUT.class;
                    break;
                }
                if (annotation2 instanceof DELETE) {
                    httpClient = new HttpClient(HttpManager.HTTP_DELETE);
                    DELETE delete = (DELETE) annotation2;
                    str = delete.value();
                    z7 = delete.paramsNeedEncode();
                    cls = DELETE.class;
                    break;
                }
                i14++;
            }
            if (cls == null) {
                if (returnType == AsyncResponse.class) {
                    AsyncResponse asyncResponse = new AsyncResponse();
                    asyncResponse.a(new Throwable("UN_SUPPORT_REQUEST_METHOD"));
                    return asyncResponse;
                }
                Response response = new Response();
                response.setE(new Throwable("UN_SUPPORT_REQUEST_METHOD"));
                return response;
            }
            try {
                String makeQueryString = ParamsUtils.makeQueryString(arrayList.toArray());
                String makeQueryString2 = BodyData.TYPE_URL_ENCODED.equals(str6) ? ParamsUtils.makeQueryString(arrayList2.toArray(), z7) : BodyData.TYPE_FORM_DATA.equals(str6) ? ParamsUtils.makeFormString(arrayList2.toArray(), z7) : ParamsUtils.makeJsonString(arrayList2.toArray(), z7);
                String str8 = HttpManager.this.f5490a + HttpManager.this.f5491b + str;
                Class a8 = HttpManager.this.a(method);
                HttpClient.HttpHeader httpHeader = new HttpClient.HttpHeader();
                HttpManager.this.a(httpHeader, cls, str6);
                httpClient.setHeader(httpHeader.setCustom(ParamsUtils.getParamsMap(arrayList3.toArray())));
                if (returnType == AsyncResponse.class) {
                    AsyncResponse asyncResponse2 = new AsyncResponse();
                    HttpManager.this.f5492c.submit(new RunnableC0059a(httpClient, str8, makeQueryString, makeQueryString2, hashMap, a8, asyncResponse2));
                    return asyncResponse2;
                }
                Response response2 = new Response();
                HttpClient.HttpResponse request = httpClient.request(str8, makeQueryString, makeQueryString2, hashMap);
                if (request.getError() != HttpClient.HttpStateError.NO_ERROR) {
                    response2.setE(new Throwable(request.getError().toString()));
                } else if (a8 != null) {
                    try {
                        response2.setData(ParamsUtils.toObject(request.getData(), a8));
                    } catch (Exception e8) {
                        response2.setE(e8);
                    }
                }
                return response2;
            } catch (Exception e9) {
                if (returnType == AsyncResponse.class) {
                    AsyncResponse asyncResponse3 = new AsyncResponse();
                    asyncResponse3.a((Throwable) e9);
                    return asyncResponse3;
                }
                Response response3 = new Response();
                response3.setE(e9);
                return response3;
            }
        }
    }

    public HttpManager(String str) {
        this(str, "");
    }

    public <T> T getApiInstance(Class<T> cls) {
        return (T) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{cls}, new a());
    }

    public HttpManager(String str, String str2) {
        this.f5490a = "";
        this.f5491b = "";
        this.f5492c = com.baidu.mapapi.a.a();
        if (!TextUtils.isEmpty(str)) {
            this.f5490a = str;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f5491b = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HttpClient.HttpHeader httpHeader, Class<?> cls, String str) {
        if (httpHeader != null) {
            if (cls == POST.class || cls == PUT.class) {
                httpHeader.setAccept("application/body").setCharset(l.UTF_8).setConnection(HttpHeaders.KEEP_ALIVE);
                if (BodyData.TYPE_URL_ENCODED.equals(str)) {
                    httpHeader.setContentType(i.VALUE_APPLICATION_URLENCODED);
                }
                if (BodyData.TYPE_FORM_DATA.equals(str)) {
                    httpHeader.setContentType("multipart/form-data;boundary=bd_map_sdk_cc");
                }
                if (BodyData.TYPE_JSON.equals(str)) {
                    httpHeader.setContentType(i.VALUE_APPLICATION_JSON);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Class<?> a(Method method) {
        Iterator<Map.Entry<String, ClassInfo>> it = ClassInfo.getType(method.getGenericReturnType()).getGenericParams().entrySet().iterator();
        if (it.hasNext()) {
            return it.next().getValue().getRawType();
        }
        return null;
    }
}

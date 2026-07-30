package r4;

import android.net.Uri;
import com.drake.net.request.Method;
import com.drake.net.utils.g;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.m0;
import kotlin.jvm.internal.s;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b extends a {
    private RequestBody body;
    private FormBody.Builder formBody;
    private MediaType mediaType = c.INSTANCE.getFORM();
    private Method method = Method.POST;
    private MultipartBody.Builder partBody;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        int i8 = 1;
        this.partBody = new MultipartBody.Builder(null, i8, 0 == true ? 1 : 0);
        this.formBody = new FormBody.Builder(0 == true ? 1 : 0, i8, 0 == true ? 1 : 0);
    }

    public final void addUploadListener(com.drake.net.interfaces.c progressListener) {
        s.checkNotNullParameter(progressListener, "progressListener");
        d.uploadListeners(getOkHttpRequest()).add(progressListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [okhttp3.RequestBody] */
    /* JADX WARN: Type inference failed for: r0v2, types: [okhttp3.FormBody] */
    /* JADX WARN: Type inference failed for: r0v4, types: [okhttp3.MultipartBody] */
    /* JADX WARN: Type inference failed for: r0v5, types: [okhttp3.RequestBody] */
    /* JADX WARN: Type inference failed for: r1v4, types: [okhttp3.Request$Builder] */
    @Override // r4.a
    public Request buildRequest() {
        ?? build;
        if (getBody() != null) {
            build = getBody();
        } else {
            build = getFormBody().build();
            try {
                getPartBody().build();
                int size = build.size();
                for (int i8 = 0; i8 < size; i8++) {
                    getPartBody().addFormDataPart(build.name(i8), build.value(i8));
                }
                build = getPartBody().setType(getMediaType()).build();
            } catch (IllegalStateException unused) {
            }
        }
        return d.setConverter(getOkHttpRequest().method(getMethod().name(), build).url(getHttpUrl().build()), getConverter()).build();
    }

    public RequestBody getBody() {
        return this.body;
    }

    public FormBody.Builder getFormBody() {
        return this.formBody;
    }

    public MediaType getMediaType() {
        return this.mediaType;
    }

    @Override // r4.a
    public Method getMethod() {
        return this.method;
    }

    public MultipartBody.Builder getPartBody() {
        return this.partBody;
    }

    public final void json(JSONObject jSONObject) {
        String jSONObject2;
        setBody((jSONObject == null || (jSONObject2 = jSONObject.toString()) == null) ? null : RequestBody.Companion.create(jSONObject2, c.INSTANCE.getJSON()));
    }

    @Override // r4.a
    public void param(String name, String str) {
        s.checkNotNullParameter(name, "name");
        FormBody.Builder formBody = getFormBody();
        if (str == null) {
            return;
        }
        formBody.add(name, str);
    }

    public void setBody(RequestBody requestBody) {
        this.body = requestBody;
    }

    public void setFormBody(FormBody.Builder builder) {
        s.checkNotNullParameter(builder, "<set-?>");
        this.formBody = builder;
    }

    public void setMediaType(MediaType mediaType) {
        s.checkNotNullParameter(mediaType, "<set-?>");
        this.mediaType = mediaType;
    }

    @Override // r4.a
    public void setMethod(Method method) {
        s.checkNotNullParameter(method, "<set-?>");
        this.method = method;
    }

    public void setPartBody(MultipartBody.Builder builder) {
        s.checkNotNullParameter(builder, "<set-?>");
        this.partBody = builder;
    }

    public final void json(JSONArray jSONArray) {
        String jSONArray2;
        setBody((jSONArray == null || (jSONArray2 = jSONArray.toString()) == null) ? null : RequestBody.Companion.create(jSONArray2, c.INSTANCE.getJSON()));
    }

    @Override // r4.a
    public void param(String name, String str, boolean z7) {
        s.checkNotNullParameter(name, "name");
        if (str == null) {
            return;
        }
        if (z7) {
            getFormBody().addEncoded(name, str);
        } else {
            getFormBody().add(name, str);
        }
    }

    public final void json(String str) {
        setBody(str != null ? RequestBody.Companion.create(str, c.INSTANCE.getJSON()) : null);
    }

    public final void json(Map<String, ? extends Object> map) {
        RequestBody.Companion companion = RequestBody.Companion;
        if (map == null) {
            return;
        }
        String jSONObject = new JSONObject(map).toString();
        s.checkNotNullExpressionValue(jSONObject, "JSONObject(body ?: return).toString()");
        setBody(companion.create(jSONObject, c.INSTANCE.getJSON()));
    }

    @Override // r4.a
    public void param(String name, Number number) {
        s.checkNotNullParameter(name, "name");
        if (number == null) {
            return;
        }
        getFormBody().add(name, number.toString());
    }

    public final void json(Pair<String, ? extends Object>... body) {
        Map map;
        s.checkNotNullParameter(body, "body");
        RequestBody.Companion companion = RequestBody.Companion;
        map = m0.toMap(body);
        String jSONObject = new JSONObject(map).toString();
        s.checkNotNullExpressionValue(jSONObject, "JSONObject(body.toMap()).toString()");
        setBody(companion.create(jSONObject, c.INSTANCE.getJSON()));
    }

    @Override // r4.a
    public void param(String name, Boolean bool) {
        s.checkNotNullParameter(name, "name");
        if (bool != null) {
            bool.booleanValue();
            getFormBody().add(name, bool.toString());
        }
    }

    public final void param(String name, RequestBody requestBody) {
        s.checkNotNullParameter(name, "name");
        if (requestBody == null) {
            return;
        }
        getPartBody().addFormDataPart(name, null, requestBody);
    }

    public final void param(String name, String str, RequestBody requestBody) {
        s.checkNotNullParameter(name, "name");
        if (requestBody == null) {
            return;
        }
        getPartBody().addFormDataPart(name, str, requestBody);
    }

    public final void param(String name, ByteString byteString) {
        s.checkNotNullParameter(name, "name");
        if (byteString == null) {
            return;
        }
        getPartBody().addFormDataPart(name, null, RequestBody.Companion.create$default(RequestBody.Companion, byteString, (MediaType) null, 1, (Object) null));
    }

    public final void param(String name, byte[] bArr) {
        s.checkNotNullParameter(name, "name");
        if (bArr == null) {
            return;
        }
        getPartBody().addFormDataPart(name, null, RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null));
    }

    public final void param(String name, Uri uri) {
        s.checkNotNullParameter(name, "name");
        if (uri == null) {
            return;
        }
        getPartBody().addFormDataPart(name, g.fileName(uri), g.toRequestBody(uri));
    }

    public final void param(String name, File file) {
        s.checkNotNullParameter(name, "name");
        if (file == null) {
            return;
        }
        getPartBody().addFormDataPart(name, file.getName(), com.drake.net.utils.a.toRequestBody$default(file, null, 1, null));
    }

    public final void param(String name, List<? extends File> list) {
        s.checkNotNullParameter(name, "name");
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                param(name, (File) it.next());
            }
        }
    }

    public final void param(String name, String str, File file) {
        RequestBody requestBody$default;
        s.checkNotNullParameter(name, "name");
        MultipartBody.Builder partBody = getPartBody();
        if (file == null || (requestBody$default = com.drake.net.utils.a.toRequestBody$default(file, null, 1, null)) == null) {
            return;
        }
        partBody.addFormDataPart(name, str, requestBody$default);
    }

    public final void param(MultipartBody.Part body) {
        s.checkNotNullParameter(body, "body");
        getPartBody().addPart(body);
    }
}

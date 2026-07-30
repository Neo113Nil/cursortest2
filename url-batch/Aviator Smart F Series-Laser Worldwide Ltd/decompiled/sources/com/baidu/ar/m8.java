package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.baidumap.MapDuMixParams;
import com.baidu.ar.baidumap.bean.CommandDate;
import com.baidu.ar.baidumap.bean.CommandType;
import com.baidu.ar.baidumap.bean.NavigationRes;
import com.baidu.ar.baidumap.bean.VpasArrow;
import com.baidu.ar.baidumap.bean.VpasDestination;
import com.baidu.ar.baidumap.bean.VpasResource;
import com.baidu.ar.content.ContentCloud;
import com.baidu.ar.content.IARCaseInfo;
import com.baidu.ar.content.IRequestCallback;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.ar.ihttp.IHttpResponse;
import com.baidu.ar.ihttp.IProgressCallback;
import com.baidu.ar.statistic.StatisticConstants;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m8 {

    public class a implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f2795a;

        public a(Context context) {
            this.f2795a = context;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            h.b("MapBusiness", "getNavigationRes request() fail!!!");
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            List<NavigationRes> list;
            if (!iHttpResponse.isSuccess()) {
                h.b("MapBusiness", "getNavigationRes onResponse() fail!!!");
                return;
            }
            try {
                list = ke.b(iHttpResponse.getContent());
            } catch (Exception unused) {
                h.b("MapBusiness", "getNavigationRes onResponse() parse() error!!!");
                list = null;
            }
            m8.this.a(list, this.f2795a);
        }
    }

    public class b implements IRequestCallback<IARCaseInfo> {
        public b(m8 m8Var) {
        }

        @Override // com.baidu.ar.content.IRequestCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(IARCaseInfo iARCaseInfo) {
        }

        @Override // com.baidu.ar.content.IRequestCallback
        public void onFail(int i8, String str) {
        }
    }

    public class c implements IProgressCallback {
        public c(m8 m8Var) {
        }

        @Override // com.baidu.ar.ihttp.IProgressCallback
        public void onProgress(int i8, int i9) {
        }
    }

    public class d implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s9 f2797a;

        public d(m8 m8Var, s9 s9Var) {
            this.f2797a = s9Var;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            httpException.printStackTrace();
            h.b("MapBusiness", "getVpasRes request() fail!!!");
            s9 s9Var = this.f2797a;
            if (s9Var != null) {
                s9Var.a(false, httpException.getMessage(), null);
            }
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            VpasResource vpasResource;
            s9 s9Var;
            try {
                try {
                    vpasResource = ke.c(iHttpResponse.getContent());
                } catch (Exception unused) {
                    h.b("MapBusiness", "getVpasRes onResponse() parse() error!!!");
                    vpasResource = null;
                }
                if (vpasResource == null || (s9Var = this.f2797a) == null) {
                    return;
                }
                s9Var.a(true, FirebaseAnalytics.Param.SUCCESS, vpasResource);
            } catch (Exception e8) {
                e8.printStackTrace();
                h.b("MapBusiness", "getVpasRes request() fail!!!");
                s9 s9Var2 = this.f2797a;
                if (s9Var2 != null) {
                    s9Var2.a(false, e8.getMessage(), null);
                }
            }
        }
    }

    public static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2798a;

        static {
            int[] iArr = new int[CommandType.values().length];
            f2798a = iArr;
            try {
                iArr[CommandType.VPAS_DRAW_ARROW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2798a[CommandType.VPAS_REMOVE_ARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2798a[CommandType.VPAS_DESTINATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public m8(DuMixController duMixController, MapDuMixParams mapDuMixParams) {
    }

    public void a() {
    }

    public void b(VpasArrow vpasArrow) {
    }

    public void a(Context context, String str, s9 s9Var) {
        IHttpRequest newRequest = HttpFactory.newRequest();
        if (newRequest == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("building_id", str);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        newRequest.setMethod(HttpManager.HTTP_POST).setUrl(id.n()).setBody(jSONObject);
        newRequest.enqueue(new a(context));
    }

    public void a(CommandType commandType, CommandDate commandDate) {
        int i8 = e.f2798a[commandType.ordinal()];
        if (i8 == 1) {
            a((VpasArrow) commandDate);
        } else if (i8 == 2) {
            b((VpasArrow) commandDate);
        } else {
            if (i8 != 3) {
                return;
            }
            a((VpasDestination) commandDate);
        }
    }

    public void a(VpasArrow vpasArrow) {
    }

    public void a(VpasDestination vpasDestination) {
    }

    public void a(String str, s9 s9Var) {
        if (HttpFactory.newRequest() != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(StatisticConstants.VPS_SESSION_ID, str);
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
            r8.a(id.o(), jSONObject, new d(this, s9Var));
        }
    }

    public final void a(List<NavigationRes> list, Context context) {
        if (list == null || list.size() <= 0) {
            return;
        }
        ContentCloud contentCloud = new ContentCloud(context);
        Iterator<NavigationRes> it = list.iterator();
        while (it.hasNext()) {
            contentCloud.downloadCase(it.next().getArkey(), new b(this), new c(this));
        }
    }
}

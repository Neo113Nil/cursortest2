package H0;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    protected d f709b;

    /* renamed from: c, reason: collision with root package name */
    private final String f710c;

    /* renamed from: d, reason: collision with root package name */
    private final c f711d;

    /* renamed from: e, reason: collision with root package name */
    private final int f712e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f713f;

    /* renamed from: g, reason: collision with root package name */
    private final String f714g;

    /* renamed from: h, reason: collision with root package name */
    private final GrsBaseInfo f715h;

    /* renamed from: i, reason: collision with root package name */
    private final F0.c f716i;

    public a(String str, int i4, c cVar, Context context, String str2, GrsBaseInfo grsBaseInfo, F0.c cVar2) {
        this.f710c = str;
        this.f711d = cVar;
        this.f712e = i4;
        this.f713f = context;
        this.f714g = str2;
        this.f715h = grsBaseInfo;
        this.f716i = cVar2;
    }

    public Context a() {
        return this.f713f;
    }

    public c b() {
        return this.f711d;
    }

    public String c() {
        return this.f710c;
    }

    public int d() {
        return this.f712e;
    }

    public String e() {
        return this.f714g;
    }

    public F0.c f() {
        return this.f716i;
    }

    public Callable g() {
        return new f(this.f710c, this.f712e, this.f711d, this.f713f, this.f714g, this.f715h, this.f716i);
    }
}

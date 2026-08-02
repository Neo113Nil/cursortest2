package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eiy implements jrw {
    private final jsb a;
    private final /* synthetic */ int b;

    public eiy(jsb jsbVar, int i) {
        this.b = i;
        this.a = jsbVar;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        switch (this.b) {
            case 0:
                return jtt.a.bB().f(((jrk) this.a).b());
            case 1:
                return Boolean.valueOf(jtt.a.bB().g(((jrk) this.a).b()));
            case 2:
                return Boolean.valueOf(juu.a.bB().a(((jrk) this.a).b()));
            case 3:
                return Boolean.valueOf(juu.a.bB().b(((jrk) this.a).b()));
            case 4:
                return Boolean.valueOf(juu.a.bB().c(((jrk) this.a).b()));
            case 5:
                return jtw.a.bB().a(((jrk) this.a).b());
            case 6:
                return Boolean.valueOf(juo.a.bB().d(((jrk) this.a).b()));
            case 7:
                return Boolean.valueOf(juo.a.bB().c(((jrk) this.a).b()));
            case 8:
                return Boolean.valueOf(jvm.a.bB().g(((jrk) this.a).b()));
            case 9:
                return Boolean.valueOf(jul.a.bB().c(((jrk) this.a).b()));
            case 10:
                return Long.valueOf(jva.a.bB().a(((jrk) this.a).b()));
            case 11:
                return jtz.a.bB().a(((jrk) this.a).b());
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return juc.a.bB().b(((jrk) this.a).b());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return juc.a.bB().d(((jrk) this.a).b());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return jvj.a.bB().a(((jrk) this.a).b());
            case 15:
                return Boolean.valueOf(juc.a.bB().e(((jrk) this.a).b()));
            case 16:
                return Boolean.valueOf(jtt.a.bB().h(((jrk) this.a).b()));
            case 17:
                return Boolean.valueOf(jtt.a.bB().i(((jrk) this.a).b()));
            case 18:
                return Boolean.valueOf(jtt.a.bB().j(((jrk) this.a).b()));
            case 19:
                return Boolean.valueOf(jvj.a.bB().c(((jrk) this.a).b()));
            default:
                return Boolean.valueOf(jui.a.bB().a(((jrk) this.a).b()));
        }
    }
}

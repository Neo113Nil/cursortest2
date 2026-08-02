package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eiz implements jrw {
    private final jsb a;
    private final /* synthetic */ int b;

    public eiz(jsb jsbVar, int i) {
        this.b = i;
        this.a = jsbVar;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(jui.a.bB().c(((jrk) this.a).b()));
            case 1:
                return Boolean.valueOf(jui.a.bB().b(((jrk) this.a).b()));
            case 2:
                return Boolean.valueOf(juc.a.bB().f(((jrk) this.a).b()));
            case 3:
                return Boolean.valueOf(jvm.a.bB().h(((jrk) this.a).b()));
            case 4:
                return Boolean.valueOf(jva.a.bB().d(((jrk) this.a).b()));
            case 5:
                return Boolean.valueOf(jvj.a.bB().d(((jrk) this.a).b()));
            case 6:
                return Boolean.valueOf(jvm.a.bB().i(((jrk) this.a).b()));
            case 7:
                return Boolean.valueOf(juu.a.bB().d(((jrk) this.a).b()));
            case 8:
                return Long.valueOf(jva.a.bB().b(((jrk) this.a).b()));
            case 9:
                return jul.a.bB().a(((jrk) this.a).b());
            case 10:
                return jul.a.bB().b(((jrk) this.a).b());
            case 11:
                return Long.valueOf(juc.a.bB().a(((jrk) this.a).b()));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Long.valueOf(jtt.a.bB().a(((jrk) this.a).b()));
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return Long.valueOf(jtt.a.bB().b(((jrk) this.a).b()));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Long.valueOf(jtt.a.bB().d(((jrk) this.a).b()));
            case 15:
                return Long.valueOf(jtt.a.bB().c(((jrk) this.a).b()));
            case 16:
                return Long.valueOf(jtt.a.bB().e(((jrk) this.a).b()));
            case 17:
                return Long.valueOf(jvm.a.bB().a(((jrk) this.a).b()));
            case 18:
                return Long.valueOf(jvm.a.bB().b(((jrk) this.a).b()));
            case 19:
                return Long.valueOf(jvm.a.bB().c(((jrk) this.a).b()));
            default:
                return Long.valueOf(jvm.a.bB().d(((jrk) this.a).b()));
        }
    }
}

package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eja implements jrw {
    private final jsb a;
    private final /* synthetic */ int b;

    public eja(jsb jsbVar, int i) {
        this.b = i;
        this.a = jsbVar;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        switch (this.b) {
            case 0:
                return juo.a.bB().b(((jrk) this.a).b());
            case 1:
                return Boolean.valueOf(juo.a.bB().e(((jrk) this.a).b()));
            case 2:
                return jux.a.bB().a(((jrk) this.a).b());
            case 3:
                return Boolean.valueOf(juo.a.bB().f(((jrk) this.a).b()));
            case 4:
                return Long.valueOf(jvm.a.bB().e(((jrk) this.a).b()));
            case 5:
                return Long.valueOf(jvm.a.bB().f(((jrk) this.a).b()));
            case 6:
                return Long.valueOf(juo.a.bB().a(((jrk) this.a).b()));
            case 7:
                return Boolean.valueOf(juo.a.bB().g(((jrk) this.a).b()));
            case 8:
                return juc.a.bB().c(((jrk) this.a).b());
            case 9:
                return Boolean.valueOf(jvg.a.bB().b(((jrk) this.a).b()));
            case 10:
                return Boolean.valueOf(jui.a.bB().d(((jrk) this.a).b()));
            case 11:
                return jva.a.bB().c(((jrk) this.a).b());
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return jvd.a.bB().a(((jrk) this.a).b());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return jvg.a.bB().a(((jrk) this.a).b());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return jvj.a.bB().b(((jrk) this.a).b());
            case 15:
                return Boolean.valueOf(juu.a.bB().e(((jrk) this.a).b()));
            case 16:
                return new ejn(jrv.a(this.a), 0);
            case 17:
                return new igv((eka) this.a.b(), 1);
            case 18:
                Boolean bool = (Boolean) ((gzp) ((jrx) this.a).a).d(false);
                bool.booleanValue();
                return bool;
            case 19:
                return new elb((emg) this.a.b());
            default:
                return new elf(((jrk) this.a).b());
        }
    }
}

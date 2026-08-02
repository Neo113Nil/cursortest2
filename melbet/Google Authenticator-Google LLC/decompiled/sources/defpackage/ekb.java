package defpackage;

import java.util.Collections;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ekb implements jrw {
    private final jsb a;
    private final jsb b;
    private final /* synthetic */ int c;

    public ekb(jsb jsbVar, jsb jsbVar2, int i) {
        this.c = i;
        this.a = jsbVar;
        this.b = jsbVar2;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        switch (this.c) {
            case 0:
                return new eka((fwm) this.a.b(), (gzp) ((jrx) this.b).a);
            case 1:
                return new ejn(this.a, 1);
            case 2:
                return new bry(((jrk) this.b).b(), (elc) this.a.b());
            case 3:
                return new elc((elb) this.b.b(), this.a);
            case 4:
                return new fwm((Object) ((ekr) this.a).b(), (Object) ((jrk) this.b).b(), (byte[]) null);
            case 5:
                ((bnu) this.a).a();
                return new hjn((emk) this.b.b());
            case 6:
                Object hjnVar = !((gzp) ((jrx) this.a).a).f() ? hjb.a : new hjn((emk) this.b.b());
                hjnVar.getClass();
                return hjnVar;
            case 7:
                Set s = a.s(((bnu) this.a).a(), this.b);
                s.getClass();
                return s;
            case 8:
                Set s2 = a.s((gzp) ((jrx) this.a).a, this.b);
                s2.getClass();
                return s2;
            case 9:
                Object hjnVar2 = ((gzp) ((jrx) this.a).a).f() ? new hjn(((eol) this.b).b()) : hjb.a;
                hjnVar2.getClass();
                return hjnVar2;
            case 10:
                Object hjnVar3 = ((gzp) ((jrx) this.a).a).f() ? new hjn((emk) this.b.b()) : hjb.a;
                hjnVar3.getClass();
                return hjnVar3;
            case 11:
                Set s3 = a.s(((bnu) this.a).a(), this.b);
                s3.getClass();
                return s3;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object hjnVar4 = ((epz) ((gzs) ((bnu) this.a).a()).a).b() ? new hjn(new eqf((Executor) this.b.b())) : Collections.EMPTY_SET;
                hjnVar4.getClass();
                return hjnVar4;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Set s4 = a.s(((bnu) this.a).a(), this.b);
                s4.getClass();
                return s4;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((bnu) this.a).a();
                erd erdVar = (erd) this.b.b();
                erdVar.getClass();
                return erdVar;
            case 15:
                Set s5 = a.s(((bnu) this.a).a(), this.b);
                s5.getClass();
                return s5;
            case 16:
                return new erh((Random) ((gzp) ((jrx) this.a).a).d((Random) this.b.b()));
            case 17:
                return new ggw((gzp) ((jrx) this.a).a);
            case 18:
                return new ewr((gzp) ((jrx) this.b).a, ((jrz) this.a).b());
            case 19:
                return new ewv(this.a);
            default:
                return new fsi((afr) ((jrx) this.a).a, this.b);
        }
    }

    public ekb(jsb jsbVar, jsb jsbVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = jsbVar;
        this.a = jsbVar2;
    }
}

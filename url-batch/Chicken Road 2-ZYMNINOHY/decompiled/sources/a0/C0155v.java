package a0;

import W.InterfaceC0118k;
import b0.C0255a;

/* renamed from: a0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0155v implements InterfaceC0118k, u2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4247b;

    public /* synthetic */ C0155v(int i4, int i5) {
        this.f4246a = i5;
        this.f4247b = i4;
    }

    @Override // u2.d, S1.h
    public Object apply(Object obj) {
        return Integer.valueOf(this.f4247b);
    }

    @Override // W.InterfaceC0118k
    public void invoke(Object obj) {
        switch (this.f4246a) {
            case 0:
                ((T.L) obj).onRepeatModeChanged(this.f4247b);
                break;
            case 1:
                ((T.L) obj).onAudioSessionIdChanged(this.f4247b);
                break;
            default:
                b0.h hVar = (b0.h) obj;
                hVar.getClass();
                int i4 = this.f4247b;
                if (i4 == 1) {
                    hVar.v = true;
                }
                hVar.f5307l = i4;
                break;
        }
    }

    public /* synthetic */ C0155v(C0255a c0255a, int i4, T.M m4, T.M m5) {
        this.f4246a = 3;
        this.f4247b = i4;
    }
}

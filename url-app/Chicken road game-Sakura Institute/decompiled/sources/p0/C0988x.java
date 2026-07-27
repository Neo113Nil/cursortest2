package p0;

import A.g0;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z2.C1400D;

/* renamed from: p0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0988x implements InterfaceC0946G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0946G f9076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0941B f9077c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0946G f9079e;

    public /* synthetic */ C0988x(InterfaceC0946G interfaceC0946G, C0941B c0941b, int i2, InterfaceC0946G interfaceC0946G2, int i4) {
        this.f9075a = i4;
        this.f9077c = c0941b;
        this.f9078d = i2;
        this.f9079e = interfaceC0946G2;
        this.f9076b = interfaceC0946G;
    }

    @Override // p0.InterfaceC0946G
    public final int g() {
        switch (this.f9075a) {
        }
        return this.f9076b.g();
    }

    @Override // p0.InterfaceC0946G
    public final int j() {
        switch (this.f9075a) {
        }
        return this.f9076b.j();
    }

    @Override // p0.InterfaceC0946G
    public final Map k() {
        switch (this.f9075a) {
        }
        return this.f9076b.k();
    }

    @Override // p0.InterfaceC0946G
    public final void l() {
        switch (this.f9075a) {
            case 0:
                C0941B c0941b = this.f9077c;
                c0941b.f8982k = this.f9078d;
                this.f9079e.l();
                Set entrySet = c0941b.f8989r.entrySet();
                g0 predicate = new g0(24, c0941b);
                Intrinsics.checkNotNullParameter(entrySet, "<this>");
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                C1400D.k(entrySet, predicate, true);
                break;
            default:
                C0941B c0941b2 = this.f9077c;
                c0941b2.f8981j = this.f9078d;
                this.f9079e.l();
                c0941b2.d(c0941b2.f8981j);
                break;
        }
    }

    @Override // p0.InterfaceC0946G
    public final Function1 m() {
        switch (this.f9075a) {
        }
        return this.f9076b.m();
    }
}

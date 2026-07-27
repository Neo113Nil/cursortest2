package r0;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import p0.InterfaceC0946G;

/* loaded from: classes.dex */
public final class M implements InterfaceC0946G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9696b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f9697c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f9698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f9699e;

    public M(int i2, int i4, Map map, Function1 function1, O o4) {
        this.f9695a = i2;
        this.f9696b = i4;
        this.f9697c = map;
        this.f9698d = function1;
        this.f9699e = o4;
    }

    @Override // p0.InterfaceC0946G
    public final int g() {
        return this.f9695a;
    }

    @Override // p0.InterfaceC0946G
    public final int j() {
        return this.f9696b;
    }

    @Override // p0.InterfaceC0946G
    public final Map k() {
        return this.f9697c;
    }

    @Override // p0.InterfaceC0946G
    public final void l() {
        this.f9698d.invoke(this.f9699e.f9704o);
    }

    @Override // p0.InterfaceC0946G
    public final Function1 m() {
        return null;
    }
}

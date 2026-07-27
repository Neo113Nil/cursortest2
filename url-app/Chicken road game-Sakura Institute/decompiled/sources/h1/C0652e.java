package h1;

import M2.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import z3.v;

/* renamed from: h1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0652e extends p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0653f f6838e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0652e(C0653f c0653f, int i2) {
        super(0);
        this.f6837d = i2;
        this.f6838e = c0653f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6837d) {
            case 0:
                C0653f c0653f = this.f6838e;
                v vVar = (v) c0653f.f6843c.invoke();
                if (A3.c.a(vVar) != -1) {
                    return E1.i.i(vVar.f12038d.C(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + c0653f.f6843c + ", instead got " + vVar).toString());
            default:
                E1.i iVar = C0653f.f6840f;
                C0653f c0653f2 = this.f6838e;
                synchronized (iVar) {
                    C0653f.f6839e.remove(((v) c0653f2.f6844d.getValue()).f12038d.C());
                }
                return Unit.f7487a;
        }
    }
}

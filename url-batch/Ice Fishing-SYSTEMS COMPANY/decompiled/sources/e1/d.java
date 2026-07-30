package e1;

import X0.v;
import android.graphics.Path;
import d1.C4455a;
import f1.AbstractC4490a;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f37242a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f37243b;

    /* renamed from: c, reason: collision with root package name */
    public final C4455a f37244c;

    /* renamed from: d, reason: collision with root package name */
    public final C4455a f37245d;

    /* renamed from: e, reason: collision with root package name */
    public final C4455a f37246e;

    /* renamed from: f, reason: collision with root package name */
    public final C4455a f37247f;

    /* renamed from: g, reason: collision with root package name */
    public final String f37248g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f37249h;

    public d(String str, int i, Path.FillType fillType, C4455a c4455a, C4455a c4455a2, C4455a c4455a3, C4455a c4455a4, boolean z8) {
        this.f37242a = i;
        this.f37243b = fillType;
        this.f37244c = c4455a;
        this.f37245d = c4455a2;
        this.f37246e = c4455a3;
        this.f37247f = c4455a4;
        this.f37248g = str;
        this.f37249h = z8;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4490a abstractC4490a) {
        return new Z0.h(vVar, iVar, abstractC4490a, this);
    }
}

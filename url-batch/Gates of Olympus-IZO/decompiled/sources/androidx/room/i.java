package androidx.room;

import H2.AbstractC0080b;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import k.C0523b;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4075a;

    /* renamed from: b, reason: collision with root package name */
    public final A2.g f4076b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4077c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4078d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4079e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4080f;

    public i(Context context, C0523b c0523b, A2.g gVar, ArrayList arrayList, int i3, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        Z1.i.f(gVar, "migrationContainer");
        AbstractC0080b.s("journalMode", i3);
        this.f4075a = context;
        this.f4076b = gVar;
        this.f4077c = arrayList;
        this.f4078d = i3;
        this.f4079e = arrayList2;
        this.f4080f = arrayList3;
    }
}

package com.android.volley;

import android.support.v7.widget.helper.ItemTouchHelper;
import java.util.Map;

/* compiled from: NetworkResponse.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f2284a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2285b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f2286c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2287d;
    public final long e;

    public i(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.f2284a = i;
        this.f2285b = bArr;
        this.f2286c = map;
        this.f2287d = z;
        this.e = j;
    }

    public i(byte[] bArr, Map<String, String> map) {
        this(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, bArr, map, false, 0L);
    }
}

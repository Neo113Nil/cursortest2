package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ZO extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f28984a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f28985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4287ze f28986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZO(C4287ze c4287ze, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        Objects.requireNonNull(c4287ze);
        this.f28986c = c4287ze;
        this.f28984a = contentResolver;
        this.f28985b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8) {
        this.f28986c.l();
    }
}

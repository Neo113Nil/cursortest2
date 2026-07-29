package com.cmplay.b.a;

import android.content.Context;
import com.cmplay.b.e;
import com.cmplay.b.f;
import com.dancingbogo.skyrolline.util.NativeUtil;

/* compiled from: SharePlatform.java */
/* loaded from: classes.dex */
public abstract class c implements com.cmplay.b.d {

    /* renamed from: a, reason: collision with root package name */
    protected com.cmplay.b.a f3911a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f3912b;

    public abstract void a(f fVar);

    public c(Context context, com.cmplay.b.a aVar) {
        this.f3911a = aVar;
        this.f3912b = context;
    }

    public String a() {
        return this.f3911a.a();
    }

    public c(Context context) {
        this.f3912b = context;
    }

    protected void a(int i, int i2) {
        NativeUtil.getInstance().sendUnityMessage("NativeUtils", "SharePicture", e.f3923c + "|" + i2);
    }

    protected void b() {
    }

    protected void a(String str) {
        com.cmplay.b.b.a().a(str);
    }
}

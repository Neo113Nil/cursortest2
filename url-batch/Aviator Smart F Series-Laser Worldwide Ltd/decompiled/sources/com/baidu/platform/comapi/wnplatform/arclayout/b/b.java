package com.baidu.platform.comapi.wnplatform.arclayout.b;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes2.dex */
public class b implements com.baidu.platform.comapi.wnplatform.arclayout.b.a {

    /* renamed from: a, reason: collision with root package name */
    protected final Path f10477a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Paint f10478b;

    /* renamed from: c, reason: collision with root package name */
    private a f10479c;

    public interface a {
        Path a(int i8, int i9);

        boolean a();
    }

    public b() {
        Paint paint = new Paint(1);
        this.f10478b = paint;
        this.f10479c = null;
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1.0f);
    }

    public void a(a aVar) {
        this.f10479c = aVar;
    }

    @Override // com.baidu.platform.comapi.wnplatform.arclayout.b.a
    public Paint b() {
        return this.f10478b;
    }

    @Override // com.baidu.platform.comapi.wnplatform.arclayout.b.a
    public Path c() {
        return this.f10477a;
    }

    @Override // com.baidu.platform.comapi.wnplatform.arclayout.b.a
    public boolean a() {
        a aVar = this.f10479c;
        return aVar != null && aVar.a();
    }

    @Override // com.baidu.platform.comapi.wnplatform.arclayout.b.a
    public Path b(int i8, int i9) {
        return this.f10477a;
    }

    protected Path c(int i8, int i9) {
        a aVar = this.f10479c;
        if (aVar != null) {
            return aVar.a(i8, i9);
        }
        return null;
    }

    @Override // com.baidu.platform.comapi.wnplatform.arclayout.b.a
    public void a(int i8, int i9) {
        this.f10477a.reset();
        Path c8 = c(i8, i9);
        if (c8 != null) {
            this.f10477a.set(c8);
        }
    }
}

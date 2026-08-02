package c0;

import T.C0086d;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;

/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272e extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f5548a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f5549b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O2.d f5550c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0272e(O2.d dVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f5550c = dVar;
        this.f5548a = contentResolver;
        this.f5549b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        O2.d dVar = this.f5550c;
        dVar.a(C0270c.b((Context) dVar.f2047b, (C0086d) dVar.f2055j, (AudioDeviceInfo) dVar.f2054i));
    }
}

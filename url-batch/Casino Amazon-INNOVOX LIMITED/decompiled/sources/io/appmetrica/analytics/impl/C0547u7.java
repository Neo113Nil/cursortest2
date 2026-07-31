package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.u7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0547u7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0472r7 f1511a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0547u7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C0522t7 c0522t7) {
        ContentValues contentValues = new ContentValues();
        Long l = c0522t7.f1496a;
        if (l != null) {
            contentValues.put("id", Long.valueOf(l.longValue()));
        }
        Wk wk = c0522t7.b;
        if (wk != null) {
            contentValues.put(WebViewManager.EVENT_TYPE_KEY, Integer.valueOf(wk.f1108a));
        }
        String str = c0522t7.c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C0472r7 c0472r7 = this.f1511a;
        contentValues.put("session_description", MessageNano.toByteArray(c0472r7.f1464a.fromModel(c0522t7.d)));
        return contentValues;
    }

    public C0547u7(C0472r7 c0472r7) {
        this.f1511a = c0472r7;
    }

    public /* synthetic */ C0547u7(C0472r7 c0472r7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0472r7(null, 1, null) : c0472r7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0522t7 toModel(ContentValues contentValues) {
        Wk wk;
        int intValue;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger(WebViewManager.EVENT_TYPE_KEY);
        if (asInteger != null) {
            Integer valueOf = Integer.valueOf(asInteger.intValue());
            wk = Wk.FOREGROUND;
            if (valueOf != null && (intValue = valueOf.intValue()) != 0 && intValue == 1) {
                wk = Wk.BACKGROUND;
            }
        } else {
            wk = null;
        }
        return new C0522t7(asLong, wk, contentValues.getAsString("report_request_parameters"), this.f1511a.toModel(contentValues.getAsByteArray("session_description")));
    }
}

package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.g7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0194g7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0117d7 f1267a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0194g7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C0168f7 c0168f7) {
        ContentValues contentValues = new ContentValues();
        Long l = c0168f7.f1252a;
        if (l != null) {
            contentValues.put("session_id", Long.valueOf(l.longValue()));
        }
        Wk wk = c0168f7.b;
        if (wk != null) {
            contentValues.put("session_type", Integer.valueOf(wk.f1108a));
        }
        Long l2 = c0168f7.c;
        if (l2 != null) {
            contentValues.put("number_in_session", Long.valueOf(l2.longValue()));
        }
        EnumC0095cb enumC0095cb = c0168f7.d;
        if (enumC0095cb != null) {
            contentValues.put(WebViewManager.EVENT_TYPE_KEY, Integer.valueOf(enumC0095cb.f1195a));
        }
        Long l3 = c0168f7.e;
        if (l3 != null) {
            contentValues.put("global_number", Long.valueOf(l3.longValue()));
        }
        Long l4 = c0168f7.f;
        if (l4 != null) {
            contentValues.put(InfluenceConstants.TIME, Long.valueOf(l4.longValue()));
        }
        C0117d7 c0117d7 = this.f1267a;
        contentValues.put("event_description", MessageNano.toByteArray(c0117d7.f1210a.fromModel(c0168f7.g)));
        return contentValues;
    }

    public C0194g7(C0117d7 c0117d7) {
        this.f1267a = c0117d7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0194g7(C0117d7 c0117d7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0117d7(null, 1, 0 == true ? 1 : 0) : c0117d7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0168f7 toModel(ContentValues contentValues) {
        Wk wk;
        int intValue;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            Integer valueOf = Integer.valueOf(asInteger.intValue());
            wk = Wk.FOREGROUND;
            if (valueOf != null && (intValue = valueOf.intValue()) != 0 && intValue == 1) {
                wk = Wk.BACKGROUND;
            }
        } else {
            wk = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger(WebViewManager.EVENT_TYPE_KEY);
        return new C0168f7(asLong, wk, asLong2, asInteger2 != null ? EnumC0095cb.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong(InfluenceConstants.TIME), this.f1267a.toModel(contentValues.getAsByteArray("event_description")));
    }
}

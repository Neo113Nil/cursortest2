package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.n7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0843n7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0765k7 f8839a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0843n7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C0817m7 c0817m7) {
        ContentValues contentValues = new ContentValues();
        Long l2 = c0817m7.f8767a;
        if (l2 != null) {
            contentValues.put("session_id", Long.valueOf(l2.longValue()));
        }
        EnumC0521al enumC0521al = c0817m7.f8768b;
        if (enumC0521al != null) {
            contentValues.put("session_type", Integer.valueOf(enumC0521al.f7885a));
        }
        Long l6 = c0817m7.f8769c;
        if (l6 != null) {
            contentValues.put("number_in_session", Long.valueOf(l6.longValue()));
        }
        EnumC0718ib enumC0718ib = c0817m7.f8770d;
        if (enumC0718ib != null) {
            contentValues.put(WebViewManager.EVENT_TYPE_KEY, Integer.valueOf(enumC0718ib.f8449a));
        }
        Long l7 = c0817m7.f8771e;
        if (l7 != null) {
            contentValues.put("global_number", Long.valueOf(l7.longValue()));
        }
        Long l8 = c0817m7.f8772f;
        if (l8 != null) {
            contentValues.put(InfluenceConstants.TIME, Long.valueOf(l8.longValue()));
        }
        C0765k7 c0765k7 = this.f8839a;
        contentValues.put("event_description", MessageNano.toByteArray(c0765k7.f8605a.fromModel(c0817m7.f8773g)));
        return contentValues;
    }

    public C0843n7(C0765k7 c0765k7) {
        this.f8839a = c0765k7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0843n7(C0765k7 c0765k7, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new C0765k7(null, 1, 0 == true ? 1 : 0) : c0765k7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0817m7 toModel(ContentValues contentValues) {
        EnumC0521al enumC0521al;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            enumC0521al = EnumC0521al.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                enumC0521al = EnumC0521al.BACKGROUND;
            }
        } else {
            enumC0521al = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger(WebViewManager.EVENT_TYPE_KEY);
        return new C0817m7(asLong, enumC0521al, asLong2, asInteger2 != null ? EnumC0718ib.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong(InfluenceConstants.TIME), this.f8839a.toModel(contentValues.getAsByteArray("event_description")));
    }
}

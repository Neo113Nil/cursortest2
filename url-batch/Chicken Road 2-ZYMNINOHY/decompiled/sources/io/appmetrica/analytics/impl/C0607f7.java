package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.f7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607f7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0530c7 f11823a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0607f7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C0581e7 c0581e7) {
        ContentValues contentValues = new ContentValues();
        Long l4 = c0581e7.f11729a;
        if (l4 != null) {
            contentValues.put("session_id", Long.valueOf(l4.longValue()));
        }
        Vk vk = c0581e7.f11730b;
        if (vk != null) {
            contentValues.put("session_type", Integer.valueOf(vk.f11151a));
        }
        Long l5 = c0581e7.f11731c;
        if (l5 != null) {
            contentValues.put("number_in_session", Long.valueOf(l5.longValue()));
        }
        EnumC0508bb enumC0508bb = c0581e7.f11732d;
        if (enumC0508bb != null) {
            contentValues.put("type", Integer.valueOf(enumC0508bb.f11531a));
        }
        Long l6 = c0581e7.f11733e;
        if (l6 != null) {
            contentValues.put("global_number", Long.valueOf(l6.longValue()));
        }
        Long l7 = c0581e7.f11734f;
        if (l7 != null) {
            contentValues.put("time", Long.valueOf(l7.longValue()));
        }
        C0530c7 c0530c7 = this.f11823a;
        contentValues.put("event_description", MessageNano.toByteArray(c0530c7.f11592a.fromModel(c0581e7.f11735g)));
        return contentValues;
    }

    public C0607f7(C0530c7 c0530c7) {
        this.f11823a = c0530c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0607f7(C0530c7 c0530c7, int i4, kotlin.jvm.internal.e eVar) {
        this((i4 & 1) != 0 ? new C0530c7(null, 1, 0 == true ? 1 : 0) : c0530c7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0581e7 toModel(ContentValues contentValues) {
        Vk vk;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            vk = Vk.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                vk = Vk.BACKGROUND;
            }
        } else {
            vk = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C0581e7(asLong, vk, asLong2, asInteger2 != null ? EnumC0508bb.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.f11823a.toModel(contentValues.getAsByteArray("event_description")));
    }
}

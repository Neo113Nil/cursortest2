package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.n7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0692n7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0614k7 f7925a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0692n7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C0666m7 c0666m7) {
        ContentValues contentValues = new ContentValues();
        Long l3 = c0666m7.f7858a;
        if (l3 != null) {
            contentValues.put("session_id", Long.valueOf(l3.longValue()));
        }
        EnumC0370al enumC0370al = c0666m7.f7859b;
        if (enumC0370al != null) {
            contentValues.put("session_type", Integer.valueOf(enumC0370al.f7037a));
        }
        Long l4 = c0666m7.f7860c;
        if (l4 != null) {
            contentValues.put("number_in_session", Long.valueOf(l4.longValue()));
        }
        EnumC0567ib enumC0567ib = c0666m7.f7861d;
        if (enumC0567ib != null) {
            contentValues.put("type", Integer.valueOf(enumC0567ib.f7560a));
        }
        Long l5 = c0666m7.f7862e;
        if (l5 != null) {
            contentValues.put("global_number", Long.valueOf(l5.longValue()));
        }
        Long l6 = c0666m7.f;
        if (l6 != null) {
            contentValues.put("time", Long.valueOf(l6.longValue()));
        }
        C0614k7 c0614k7 = this.f7925a;
        contentValues.put("event_description", MessageNano.toByteArray(c0614k7.f7705a.fromModel(c0666m7.f7863g)));
        return contentValues;
    }

    public C0692n7(C0614k7 c0614k7) {
        this.f7925a = c0614k7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0692n7(C0614k7 c0614k7, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new C0614k7(null, 1, 0 == true ? 1 : 0) : c0614k7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0666m7 toModel(ContentValues contentValues) {
        EnumC0370al enumC0370al;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            enumC0370al = EnumC0370al.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                enumC0370al = EnumC0370al.BACKGROUND;
            }
        } else {
            enumC0370al = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C0666m7(asLong, enumC0370al, asLong2, asInteger2 != null ? EnumC0567ib.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.f7925a.toModel(contentValues.getAsByteArray("event_description")));
    }
}

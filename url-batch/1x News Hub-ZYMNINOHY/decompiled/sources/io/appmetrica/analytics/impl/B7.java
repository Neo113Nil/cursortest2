package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class B7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0976y7 f5810a;

    /* JADX WARN: Multi-variable type inference failed */
    public B7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(A7 a7) {
        ContentValues contentValues = new ContentValues();
        Long l3 = a7.f5729a;
        if (l3 != null) {
            contentValues.put("id", Long.valueOf(l3.longValue()));
        }
        EnumC0370al enumC0370al = a7.f5730b;
        if (enumC0370al != null) {
            contentValues.put("type", Integer.valueOf(enumC0370al.f7037a));
        }
        String str = a7.f5731c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C0976y7 c0976y7 = this.f5810a;
        contentValues.put("session_description", MessageNano.toByteArray(c0976y7.f8636a.fromModel(a7.f5732d)));
        return contentValues;
    }

    public B7(C0976y7 c0976y7) {
        this.f5810a = c0976y7;
    }

    public /* synthetic */ B7(C0976y7 c0976y7, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new C0976y7(null, 1, null) : c0976y7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A7 toModel(ContentValues contentValues) {
        EnumC0370al enumC0370al;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            enumC0370al = EnumC0370al.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                enumC0370al = EnumC0370al.BACKGROUND;
            }
        } else {
            enumC0370al = null;
        }
        return new A7(asLong, enumC0370al, contentValues.getAsString("report_request_parameters"), this.f5810a.toModel(contentValues.getAsByteArray("session_description")));
    }
}

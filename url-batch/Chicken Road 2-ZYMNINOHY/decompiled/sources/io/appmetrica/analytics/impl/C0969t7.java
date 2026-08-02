package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.t7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0969t7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0892q7 f12771a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0969t7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C0943s7 c0943s7) {
        ContentValues contentValues = new ContentValues();
        Long l4 = c0943s7.f12718a;
        if (l4 != null) {
            contentValues.put("id", Long.valueOf(l4.longValue()));
        }
        Vk vk = c0943s7.f12719b;
        if (vk != null) {
            contentValues.put("type", Integer.valueOf(vk.f11151a));
        }
        String str = c0943s7.f12720c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C0892q7 c0892q7 = this.f12771a;
        contentValues.put("session_description", MessageNano.toByteArray(c0892q7.f12606a.fromModel(c0943s7.f12721d)));
        return contentValues;
    }

    public C0969t7(C0892q7 c0892q7) {
        this.f12771a = c0892q7;
    }

    public /* synthetic */ C0969t7(C0892q7 c0892q7, int i4, kotlin.jvm.internal.e eVar) {
        this((i4 & 1) != 0 ? new C0892q7(null, 1, null) : c0892q7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0943s7 toModel(ContentValues contentValues) {
        Vk vk;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            vk = Vk.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                vk = Vk.BACKGROUND;
            }
        } else {
            vk = null;
        }
        return new C0943s7(asLong, vk, contentValues.getAsString("report_request_parameters"), this.f12771a.toModel(contentValues.getAsByteArray("session_description")));
    }
}

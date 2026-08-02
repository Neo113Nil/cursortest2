package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.appthemes.Gradient;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BulletPoints extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BulletPoints> CREATOR;
    public final List text;

    static {
        BulletPoints$Companion$ADAPTER$1 bulletPoints$Companion$ADAPTER$1 = new BulletPoints$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BulletPoints.class), "type.googleapis.com/squareup.cash.aegis.core.BulletPoints", Syntax.PROTO_2, null, "squareup/cash/aegis/core/SafetyEducationHub.proto");
        ADAPTER = bulletPoints$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bulletPoints$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulletPoints(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.text = TransactorKt.immutableCopyOf("text", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BulletPoints)) {
            return false;
        }
        BulletPoints bulletPoints = (BulletPoints) obj;
        return Intrinsics.areEqual(unknownFields(), bulletPoints.unknownFields()) && Intrinsics.areEqual(this.text, bulletPoints.text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.text.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Gradient.Builder builder = new Gradient.Builder(16, false);
        builder.colors = this.text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.text;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("text=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BulletPoints{", "}", 0, null, null, 56);
    }

    public BulletPoints(List list) {
        this(list, ByteString.EMPTY);
    }
}

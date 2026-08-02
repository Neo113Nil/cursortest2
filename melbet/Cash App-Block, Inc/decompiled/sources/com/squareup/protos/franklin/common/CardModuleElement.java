package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzds;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardModuleElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardModuleElement> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final zzds f1374type;

    static {
        CardModuleElement$Companion$ADAPTER$1 cardModuleElement$Companion$ADAPTER$1 = new CardModuleElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardModuleElement.class), "type.googleapis.com/squareup.franklin.common.CardModuleElement", Syntax.PROTO_2, null, "squareup/franklin/card_modules.proto");
        ADAPTER = cardModuleElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModuleElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardModuleElement(zzds zzdsVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1374type = zzdsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardModuleElement)) {
            return false;
        }
        CardModuleElement cardModuleElement = (CardModuleElement) obj;
        return Intrinsics.areEqual(unknownFields(), cardModuleElement.unknownFields()) && Intrinsics.areEqual(this.f1374type, cardModuleElement.f1374type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzds zzdsVar = this.f1374type;
        int hashCode2 = hashCode + (zzdsVar != null ? zzdsVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(26);
        builder.claimable_payment = this.f1374type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzds zzdsVar = this.f1374type;
        if (zzdsVar != null) {
            arrayList.add("type=" + zzdsVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardModuleElement{", "}", 0, null, null, 56);
    }
}

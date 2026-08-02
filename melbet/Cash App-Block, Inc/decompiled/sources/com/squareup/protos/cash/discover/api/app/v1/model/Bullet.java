package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.protos.cash.ui.Image;
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

/* loaded from: classes7.dex */
public final class Bullet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Bullet> CREATOR;
    public final Text bullet_body;
    public final Image bullet_icon;
    public final Text bullet_title;

    static {
        Bullet$Companion$ADAPTER$1 bullet$Companion$ADAPTER$1 = new Bullet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Bullet.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.Bullet", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/bullet.proto");
        ADAPTER = bullet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bullet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bullet(Image image, Text text, Text text2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.bullet_icon = image;
        this.bullet_title = text;
        this.bullet_body = text2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bullet)) {
            return false;
        }
        Bullet bullet = (Bullet) obj;
        return Intrinsics.areEqual(unknownFields(), bullet.unknownFields()) && Intrinsics.areEqual(this.bullet_icon, bullet.bullet_icon) && Intrinsics.areEqual(this.bullet_title, bullet.bullet_title) && Intrinsics.areEqual(this.bullet_body, bullet.bullet_body);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.bullet_icon;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        Text text = this.bullet_title;
        int hashCode3 = (hashCode2 + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.bullet_body;
        int hashCode4 = hashCode3 + (text2 != null ? text2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(10);
        builder.loan_type = this.bullet_icon;
        builder.payment_schedule = this.bullet_title;
        builder.tila_data = this.bullet_body;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.bullet_icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("bullet_icon=", image, arrayList);
        }
        Text text = this.bullet_title;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("bullet_title=", text, arrayList);
        }
        Text text2 = this.bullet_body;
        if (text2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("bullet_body=", text2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Bullet{", "}", 0, null, null, 56);
    }
}

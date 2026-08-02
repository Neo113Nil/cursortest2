package com.squareup.protos.teamapp.ui;

import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes8.dex */
public final class Number extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Number> CREATOR;
    public final double amount;

    /* renamed from: format, reason: collision with root package name */
    public final Format f1413format;
    public final Integer max_fractional_digits;

    public enum Format implements WireEnum {
        NONE(0),
        DECIMAL(1),
        PERCENT(2);

        public static final Number$Format$Companion$ADAPTER$1 ADAPTER;
        public static final POPMatchingFactory Companion;
        public final int value;

        static {
            Format format2 = NONE;
            Companion = new POPMatchingFactory(4);
            ADAPTER = new Number$Format$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Format.class), Syntax.PROTO_2, format2);
        }

        Format(int i) {
            this.value = i;
        }

        public static final Format fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return NONE;
            }
            if (i == 1) {
                return DECIMAL;
            }
            if (i != 2) {
                return null;
            }
            return PERCENT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Number$Companion$ADAPTER$1 number$Companion$ADAPTER$1 = new Number$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Number.class), "type.googleapis.com/squareup.teamapp.ui.Number", Syntax.PROTO_2, null, "squareup/teamapp/ui/models.proto");
        ADAPTER = number$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(number$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Number(double d, Format format2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount = d;
        this.f1413format = format2;
        this.max_fractional_digits = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return Intrinsics.areEqual(unknownFields(), number.unknownFields()) && this.amount == number.amount && this.f1413format == number.f1413format && Intrinsics.areEqual(this.max_fractional_digits, number.max_fractional_digits);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Fragment$5$$ExternalSyntheticOutline0.m(this.amount, unknownFields().hashCode() * 37, 37);
        Format format2 = this.f1413format;
        int hashCode = (m + (format2 != null ? format2.hashCode() : 0)) * 37;
        Integer num = this.max_fractional_digits;
        int hashCode2 = hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(6);
        builder.action = Double.valueOf(this.amount);
        builder.full_applet = this.f1413format;
        builder.half_applet = this.max_fractional_digits;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("amount=" + this.amount);
        Format format2 = this.f1413format;
        if (format2 != null) {
            arrayList.add("format=" + format2);
        }
        Integer num = this.max_fractional_digits;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("max_fractional_digits=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Number{", "}", 0, null, null, 56);
    }
}

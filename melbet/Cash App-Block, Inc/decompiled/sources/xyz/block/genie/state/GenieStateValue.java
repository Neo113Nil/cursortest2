package xyz.block.genie.state;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import xyz.block.genie.expressions.ExpressionError;

/* loaded from: classes10.dex */
public abstract class GenieStateValue {

    public final class BlobValue extends GenieStateValue {
        public final ByteString value;

        public BlobValue(ByteString byteString) {
            byteString.getClass();
            this.value = byteString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BlobValue) && Intrinsics.areEqual(this.value, ((BlobValue) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return "BlobValue(value=" + this.value + ")";
        }
    }

    public final class BoolValue extends GenieStateValue {
        public final boolean value;

        public BoolValue(boolean z) {
            this.value = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BoolValue) && this.value == ((BoolValue) obj).value;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.value);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("BoolValue(value=", ")", this.value);
        }
    }

    public final class CollectionValue extends GenieStateValue {
        public final ArrayList items;

        public CollectionValue(ArrayList arrayList) {
            this.items = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CollectionValue) && this.items.equals(((CollectionValue) obj).items);
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("CollectionValue(items=", ")", this.items);
        }
    }

    public final class FloatValue extends GenieStateValue {
        public final double value;

        public FloatValue(double d) {
            this.value = d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FloatValue) && Double.compare(this.value, ((FloatValue) obj).value) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.value);
        }

        public final String toString() {
            return "FloatValue(value=" + this.value + ")";
        }
    }

    public final class GroupValue extends GenieStateValue {
        public final Map value;

        public GroupValue(Map map) {
            map.getClass();
            this.value = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GroupValue) && Intrinsics.areEqual(this.value, ((GroupValue) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("GroupValue(value=", ")", this.value);
        }
    }

    public final class IntValue extends GenieStateValue {
        public final long value;

        public IntValue(long j) {
            this.value = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntValue) && this.value == ((IntValue) obj).value;
        }

        public final int hashCode() {
            return Long.hashCode(this.value);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.value, "IntValue(value=", ")");
        }
    }

    public final class StringValue extends GenieStateValue {
        public final String value;

        public StringValue(String str) {
            str.getClass();
            this.value = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StringValue) && Intrinsics.areEqual(this.value, ((StringValue) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StringValue(value=", this.value, ")");
        }
    }

    public final double numericValue() {
        if (this instanceof IntValue) {
            return ((IntValue) this).value;
        }
        if (this instanceof FloatValue) {
            return ((FloatValue) this).value;
        }
        throw new ExpressionError.TypeMismatch("numeric", this);
    }
}

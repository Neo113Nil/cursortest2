package com.stripe.android.financialconnections.ui;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.stripe.android.financialconnections.model.ServerLink;
import com.stripe.android.model.Card;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public interface TextResource extends Parcelable {

    public final class Text implements TextResource {
        public static final Parcelable.Creator<Text> CREATOR = new Card.Creator(1);
        public final CharSequence value;

        public Text(CharSequence charSequence) {
            charSequence.getClass();
            this.value = charSequence;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Text) && Intrinsics.areEqual(this.value, ((Text) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return "Text(value=" + ((Object) this.value) + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            TextUtils.writeToParcel(this.value, parcel, i);
        }
    }

    static CharSequence buildText(int i, Composer composer, List list) {
        CharSequence text = ((Context) ((GapComposer) composer).consume(AndroidCompositionLocals_androidKt.LocalContext)).getResources().getText(i);
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            text = TextUtils.replace(text, new String[]{JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "%", "$s")}, new String[]{(String) obj});
            text.getClass();
            i2 = i3;
        }
        return text;
    }

    default CharSequence toText(Composer composer, int i) {
        CharSequence buildText;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(2059343640);
        if (this instanceof Text) {
            gapComposer.startReplaceGroup(-950682819);
            gapComposer.end(false);
            buildText = ((Text) this).value;
        } else if (this instanceof StringId) {
            gapComposer.startReplaceGroup(-950681529);
            StringId stringId = (StringId) this;
            buildText = buildText(stringId.value, gapComposer, stringId.args);
            gapComposer.end(false);
        } else {
            if (!(this instanceof PluralId)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -950683756, false);
            }
            gapComposer.startReplaceGroup(593690609);
            PluralId pluralId = (PluralId) this;
            int i2 = pluralId.count;
            List list = pluralId.args;
            if (i2 == 1) {
                gapComposer.startReplaceGroup(-950678681);
                buildText = buildText(pluralId.singular, gapComposer, list);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-950677177);
                buildText = buildText(pluralId.plural, gapComposer, list);
                gapComposer.end(false);
            }
            gapComposer.end(false);
        }
        gapComposer.end(false);
        return buildText;
    }

    public final class StringId implements TextResource {
        public static final Parcelable.Creator<StringId> CREATOR = new ServerLink.Creator(29);
        public final List args;
        public final int value;

        public StringId(int i, List list) {
            list.getClass();
            this.value = i;
            this.args = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringId)) {
                return false;
            }
            StringId stringId = (StringId) obj;
            return this.value == stringId.value && Intrinsics.areEqual(this.args, stringId.args);
        }

        public final int hashCode() {
            return this.args.hashCode() + (Integer.hashCode(this.value) * 31);
        }

        public final String toString() {
            return "StringId(value=" + this.value + ", args=" + this.args + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.value);
            parcel.writeStringList(this.args);
        }

        public StringId(int i) {
            this(i, EmptyList.INSTANCE);
        }
    }

    public final class PluralId implements TextResource {
        public static final Parcelable.Creator<PluralId> CREATOR = new ServerLink.Creator(28);
        public final List args;
        public final int count;
        public final int plural;
        public final int singular;

        public PluralId(int i, int i2, int i3, List list) {
            list.getClass();
            this.singular = i;
            this.plural = i2;
            this.count = i3;
            this.args = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PluralId)) {
                return false;
            }
            PluralId pluralId = (PluralId) obj;
            return this.singular == pluralId.singular && this.plural == pluralId.plural && this.count == pluralId.count && Intrinsics.areEqual(this.args, pluralId.args);
        }

        public final int hashCode() {
            return this.args.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.count, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.plural, Integer.hashCode(this.singular) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.singular, this.plural, "PluralId(singular=", ", plural=", ", count=");
            m107m.append(this.count);
            m107m.append(", args=");
            m107m.append(this.args);
            m107m.append(")");
            return m107m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.singular);
            parcel.writeInt(this.plural);
            parcel.writeInt(this.count);
            parcel.writeStringList(this.args);
        }

        public PluralId(int i, int i2, int i3) {
            this(i, i2, i3, EmptyList.INSTANCE);
        }
    }
}

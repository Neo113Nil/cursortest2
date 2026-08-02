package com.squareup.util;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.protos.franklin.cards.CardTheme;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Septuple {
    public final Integer fifth;
    public final Object first;
    public final Integer fourth;
    public final Integer second;
    public final Float seventh;
    public final CardModelView.CardBack sixth;
    public final Object third;

    public Septuple(CardTheme.Identifier identifier, Integer num, CardTheme.BackgroundImage backgroundImage, Integer num2, Integer num3, CardModelView.CardBack cardBack, Float f) {
        this.first = identifier;
        this.second = num;
        this.third = backgroundImage;
        this.fourth = num2;
        this.fifth = num3;
        this.sixth = cardBack;
        this.seventh = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Septuple)) {
            return false;
        }
        Septuple septuple = (Septuple) obj;
        return Intrinsics.areEqual(this.first, septuple.first) && this.second.equals(septuple.second) && Intrinsics.areEqual(this.third, septuple.third) && this.fourth.equals(septuple.fourth) && this.fifth.equals(septuple.fifth) && this.sixth.equals(septuple.sixth) && this.seventh.equals(septuple.seventh);
    }

    public final int hashCode() {
        Object obj = this.first;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m((obj == null ? 0 : obj.hashCode()) * 31, 31, this.second);
        Object obj2 = this.third;
        return this.seventh.hashCode() + ((this.sixth.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m((m + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31, this.fourth), 31, this.fifth)) * 31);
    }

    public final String toString() {
        return "Septuple(first=" + this.first + ", second=" + this.second + ", third=" + this.third + ", fourth=" + this.fourth + ", fifth=" + this.fifth + ", sixth=" + this.sixth + ", seventh=" + this.seventh + ")";
    }
}

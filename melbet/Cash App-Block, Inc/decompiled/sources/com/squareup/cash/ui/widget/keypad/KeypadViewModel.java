package com.squareup.cash.ui.widget.keypad;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class KeypadViewModel {
    public static final List keysWithSeparator;
    public static final ArrayList keysWithoutSeparator;
    public final boolean hapticsImprovementsEnabled;
    public final List keys;
    public final Function0 onClear;
    public final Function1 onClick;

    public enum KeypadKey {
        ZERO("0"),
        ONE("1"),
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),
        SIX("6"),
        SEVEN("7"),
        EIGHT("8"),
        NINE("9"),
        SEPARATOR(String.valueOf(DecimalFormatSymbols.getInstance().getDecimalSeparator())),
        CLEAR("<"),
        EMPTY("");

        public final String value;

        KeypadKey(String str) {
            this.value = str;
        }

        public final boolean isClear() {
            return this == CLEAR;
        }

        public final boolean isDigit() {
            return (this == SEPARATOR || this == CLEAR || this == EMPTY) ? false : true;
        }

        public final boolean isSeparator() {
            return this == SEPARATOR;
        }
    }

    static {
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new KeypadKey[]{KeypadKey.ONE, KeypadKey.TWO, KeypadKey.THREE, KeypadKey.FOUR, KeypadKey.FIVE, KeypadKey.SIX, KeypadKey.SEVEN, KeypadKey.EIGHT, KeypadKey.NINE, KeypadKey.SEPARATOR, KeypadKey.ZERO, KeypadKey.CLEAR});
        keysWithSeparator = listOf;
        List<KeypadKey> list = listOf;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (KeypadKey keypadKey : list) {
            if (keypadKey == KeypadKey.SEPARATOR) {
                keypadKey = KeypadKey.EMPTY;
            }
            arrayList.add(keypadKey);
        }
        keysWithoutSeparator = arrayList;
    }

    public KeypadViewModel(List list, boolean z, Function0 function0, Function1 function1, int i) {
        list = (i & 1) != 0 ? keysWithSeparator : list;
        z = (i & 2) != 0 ? false : z;
        list.getClass();
        function0.getClass();
        function1.getClass();
        this.keys = list;
        this.hapticsImprovementsEnabled = z;
        this.onClear = function0;
        this.onClick = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeypadViewModel)) {
            return false;
        }
        KeypadViewModel keypadViewModel = (KeypadViewModel) obj;
        return this.keys.equals(keypadViewModel.keys) && this.hapticsImprovementsEnabled == keypadViewModel.hapticsImprovementsEnabled && this.onClear.equals(keypadViewModel.onClear) && Intrinsics.areEqual(this.onClick, keypadViewModel.onClick);
    }

    public final int hashCode() {
        return this.onClick.hashCode() + ((this.onClear.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.keys.hashCode() * 31, 31, this.hapticsImprovementsEnabled)) * 31);
    }

    public final String toString() {
        return "KeypadViewModel(keys=" + this.keys + ", hapticsImprovementsEnabled=" + this.hapticsImprovementsEnabled + ", onClear=" + this.onClear + ", onClick=" + this.onClick + ")";
    }
}

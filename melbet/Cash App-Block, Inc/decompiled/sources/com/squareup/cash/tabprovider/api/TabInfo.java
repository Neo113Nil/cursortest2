package com.squareup.cash.tabprovider.api;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class TabInfo {
    public final Id identifier;
    public final Function1 screenMatcher;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Id {
        public static final /* synthetic */ Id[] $VALUES;
        public static final Id Activity;
        public static final Id Local;
        public static final Id Money;
        public static final Id Moneybot;
        public static final Id Payment;
        public static final Id TreehouseActivity;

        static {
            Id id = new Id("Activity", 0);
            Activity = id;
            Id id2 = new Id("Money", 1);
            Money = id2;
            Id id3 = new Id("Moneybot", 2);
            Moneybot = id3;
            Id id4 = new Id("Payment", 3);
            Payment = id4;
            Id id5 = new Id("TreehouseActivity", 4);
            TreehouseActivity = id5;
            Id id6 = new Id("Local", 5);
            Local = id6;
            $VALUES = new Id[]{id, id2, id3, id4, id5, id6};
        }

        public static Id valueOf(String str) {
            return (Id) Enum.valueOf(Id.class, str);
        }

        public static Id[] values() {
            return (Id[]) $VALUES.clone();
        }
    }

    public TabInfo(Id id, Function1 function1) {
        this.identifier = id;
        this.screenMatcher = function1;
    }
}

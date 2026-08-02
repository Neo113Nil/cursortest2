package com.withpersona.sdk2.inquiry.steps.ui.components.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class AddressAutocompleteMethod {
    public static final /* synthetic */ AddressAutocompleteMethod[] $VALUES;
    public static final AddressAutocompleteMethod None;
    public static final AddressAutocompleteMethod Server;

    static {
        AddressAutocompleteMethod addressAutocompleteMethod = new AddressAutocompleteMethod("Server", 0);
        Server = addressAutocompleteMethod;
        AddressAutocompleteMethod addressAutocompleteMethod2 = new AddressAutocompleteMethod("None", 1);
        None = addressAutocompleteMethod2;
        $VALUES = new AddressAutocompleteMethod[]{addressAutocompleteMethod, addressAutocompleteMethod2};
    }

    public static AddressAutocompleteMethod valueOf(String str) {
        return (AddressAutocompleteMethod) Enum.valueOf(AddressAutocompleteMethod.class, str);
    }

    public static AddressAutocompleteMethod[] values() {
        return (AddressAutocompleteMethod[]) $VALUES.clone();
    }
}

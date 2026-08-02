package com.squareup.cash.support.chat.backend.real;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ChatSavedInputPreference {
    public final String input;

    public /* synthetic */ ChatSavedInputPreference(String str) {
        this.input = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ChatSavedInputPreference m3750boximpl(String str) {
        return new ChatSavedInputPreference(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ChatSavedInputPreference) {
            return Intrinsics.areEqual(this.input, ((ChatSavedInputPreference) obj).input);
        }
        return false;
    }

    public final int hashCode() {
        return this.input.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ChatSavedInputPreference(input=", this.input, ")");
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m3751unboximpl() {
        return this.input;
    }
}

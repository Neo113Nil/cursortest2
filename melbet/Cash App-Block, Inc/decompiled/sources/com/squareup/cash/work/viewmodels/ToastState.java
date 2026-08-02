package com.squareup.cash.work.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ToastState {
    public final Object key;
    public final String message;

    /* renamed from: type, reason: collision with root package name */
    public final ToastType f1221type;

    public ToastState(String str, Object obj, ToastType toastType) {
        str.getClass();
        this.message = str;
        this.key = obj;
        this.f1221type = toastType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToastState)) {
            return false;
        }
        ToastState toastState = (ToastState) obj;
        return Intrinsics.areEqual(this.message, toastState.message) && Intrinsics.areEqual(this.key, toastState.key) && this.f1221type == toastState.f1221type;
    }

    public final int hashCode() {
        return this.f1221type.hashCode() + ((this.key.hashCode() + (this.message.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ToastState(message=" + this.message + ", key=" + this.key + ", type=" + this.f1221type + ")";
    }

    public /* synthetic */ ToastState(String str, Long l) {
        this(str, l, ToastType.Info);
    }
}

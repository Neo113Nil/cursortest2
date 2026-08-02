package com.squareup.cash.taptopay.encryption.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface HieroglyphKeyResult {

    public final class KeyImportFailure implements HieroglyphKeyResult {
        public final String keyAlias;

        public KeyImportFailure(String str) {
            str.getClass();
            this.keyAlias = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof KeyImportFailure) && Intrinsics.areEqual(this.keyAlias, ((KeyImportFailure) obj).keyAlias);
        }

        public final int hashCode() {
            return this.keyAlias.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("KeyImportFailure(keyAlias=", this.keyAlias, ")");
        }
    }

    public final class ProvisioningFailure implements HieroglyphKeyResult {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProvisioningFailure);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ProvisioningFailure(message=null)";
        }
    }

    public final class Success implements HieroglyphKeyResult {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return -1561781415;
        }

        public final String toString() {
            return "Success";
        }
    }
}

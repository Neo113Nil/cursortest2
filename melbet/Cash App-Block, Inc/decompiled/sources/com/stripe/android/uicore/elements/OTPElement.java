package com.stripe.android.uicore.elements;

/* loaded from: classes8.dex */
public final class OTPElement {
    public final OTPController controller;
    public final IdentifierSpec identifier;

    public OTPElement(IdentifierSpec identifierSpec, OTPController oTPController) {
        this.identifier = identifierSpec;
        this.controller = oTPController;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OTPElement) {
            OTPElement oTPElement = (OTPElement) obj;
            return this.identifier.equals(oTPElement.identifier) && this.controller == oTPElement.controller;
        }
        return false;
    }

    public final int hashCode() {
        return this.controller.hashCode() + (this.identifier.hashCode() * 31);
    }

    public final String toString() {
        return "OTPElement(identifier=" + this.identifier + ", controller=" + this.controller + ")";
    }
}

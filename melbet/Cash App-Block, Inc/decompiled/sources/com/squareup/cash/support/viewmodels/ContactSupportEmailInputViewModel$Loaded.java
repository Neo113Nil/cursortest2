package com.squareup.cash.support.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContactSupportEmailInputViewModel$Loaded {
    public final String email;
    public final boolean isEmailModified;
    public final boolean nextButtonEnabled;
    public final String title;
    public final ViewMode viewMode;

    public interface ViewMode {

        public final class Edit implements ViewMode {
            public final EditEmailState state;

            public interface EditEmailState {

                public final class Editing implements EditEmailState {
                    public static final Editing INSTANCE = new Editing();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof Editing);
                    }

                    public final int hashCode() {
                        return -1280707717;
                    }

                    public final String toString() {
                        return "Editing";
                    }
                }

                public final class Failure implements EditEmailState {
                    public final String body;
                    public final String title;

                    public Failure(String str, String str2) {
                        str.getClass();
                        str2.getClass();
                        this.title = str;
                        this.body = str2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Failure)) {
                            return false;
                        }
                        Failure failure = (Failure) obj;
                        return Intrinsics.areEqual(this.title, failure.title) && Intrinsics.areEqual(this.body, failure.body);
                    }

                    public final int hashCode() {
                        return this.body.hashCode() + (this.title.hashCode() * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Failure(title=", this.title, ", body=", this.body, ")");
                    }
                }

                /* loaded from: classes9.dex */
                public final class Verifying implements EditEmailState {
                    public static final Verifying INSTANCE = new Verifying();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof Verifying);
                    }

                    public final int hashCode() {
                        return 2056593900;
                    }

                    public final String toString() {
                        return "Verifying";
                    }
                }
            }

            public /* synthetic */ Edit(EditEmailState editEmailState) {
                this.state = editEmailState;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof Edit) {
                    return this.state.equals(((Edit) obj).state);
                }
                return false;
            }

            public final int hashCode() {
                return this.state.hashCode();
            }

            public final String toString() {
                return "Edit(state=" + this.state + ")";
            }
        }

        public final class Review implements ViewMode {
            public static final Review INSTANCE = new Review();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Review);
            }

            public final int hashCode() {
                return 1942410794;
            }

            public final String toString() {
                return "Review";
            }
        }
    }

    public ContactSupportEmailInputViewModel$Loaded(String str, String str2, boolean z, boolean z2, ViewMode viewMode) {
        str.getClass();
        viewMode.getClass();
        this.title = str;
        this.email = str2;
        this.nextButtonEnabled = z;
        this.isEmailModified = z2;
        this.viewMode = viewMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactSupportEmailInputViewModel$Loaded)) {
            return false;
        }
        ContactSupportEmailInputViewModel$Loaded contactSupportEmailInputViewModel$Loaded = (ContactSupportEmailInputViewModel$Loaded) obj;
        return Intrinsics.areEqual(this.title, contactSupportEmailInputViewModel$Loaded.title) && Intrinsics.areEqual(this.email, contactSupportEmailInputViewModel$Loaded.email) && this.nextButtonEnabled == contactSupportEmailInputViewModel$Loaded.nextButtonEnabled && this.isEmailModified == contactSupportEmailInputViewModel$Loaded.isEmailModified && Intrinsics.areEqual(this.viewMode, contactSupportEmailInputViewModel$Loaded.viewMode);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.email;
        return this.viewMode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.nextButtonEnabled), 31, this.isEmailModified);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(title=", this.title, ", email=", this.email, ", nextButtonEnabled=");
        re$$ExternalSyntheticOutline0.m(m, this.nextButtonEnabled, ", isEmailModified=", this.isEmailModified, ", viewMode=");
        m.append(this.viewMode);
        m.append(")");
        return m.toString();
    }
}

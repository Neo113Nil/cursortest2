package com.squareup.cash.support.chat.viewmodels;

import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BodyViewModel$ActionBodyViewModel extends ViewModelKt {
    public final Action action;
    public final boolean chatUiUpliftEnabled;
    public final String subtitle;
    public final String title;

    public interface Action {

        public final class OpenLink implements Action {
            public final String url;

            public OpenLink(String str) {
                str.getClass();
                this.url = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenLink) && Intrinsics.areEqual(this.url, ((OpenLink) obj).url);
            }

            public final int hashCode() {
                return this.url.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenLink(url=", this.url, ")");
            }
        }

        public final class PickTransaction implements Action {
            public static final PickTransaction INSTANCE = new PickTransaction();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PickTransaction);
            }

            public final int hashCode() {
                return 1229953677;
            }

            public final String toString() {
                return "PickTransaction";
            }
        }
    }

    public BodyViewModel$ActionBodyViewModel(String str, String str2, Action action, boolean z) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.subtitle = str2;
        this.action = action;
        this.chatUiUpliftEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BodyViewModel$ActionBodyViewModel)) {
            return false;
        }
        BodyViewModel$ActionBodyViewModel bodyViewModel$ActionBodyViewModel = (BodyViewModel$ActionBodyViewModel) obj;
        return Intrinsics.areEqual(this.title, bodyViewModel$ActionBodyViewModel.title) && Intrinsics.areEqual(this.subtitle, bodyViewModel$ActionBodyViewModel.subtitle) && this.action.equals(bodyViewModel$ActionBodyViewModel.action) && this.chatUiUpliftEnabled == bodyViewModel$ActionBodyViewModel.chatUiUpliftEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.chatUiUpliftEnabled) + ((this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActionBodyViewModel(title=", this.title, ", subtitle=", this.subtitle, ", action=");
        m.append(this.action);
        m.append(", chatUiUpliftEnabled=");
        m.append(this.chatUiUpliftEnabled);
        m.append(")");
        return m.toString();
    }
}

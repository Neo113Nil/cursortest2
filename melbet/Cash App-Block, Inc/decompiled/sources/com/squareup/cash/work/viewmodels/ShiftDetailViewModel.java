package com.squareup.cash.work.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ShiftDetailViewModel {

    public final class Error implements ShiftDetailViewModel {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -889285121;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Loaded implements ShiftDetailViewModel {
        public final Assignee assignee;
        public final Details details;
        public final Header header;
        public final boolean isClockInEnabled;
        public final Note note;
        public final boolean showClockInButton;

        public final class Assignee {
            public final String avatarMonogram;
            public final String label;
            public final String name;

            public Assignee(String str, String str2, String str3) {
                str2.getClass();
                this.name = str;
                this.label = str2;
                this.avatarMonogram = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Assignee)) {
                    return false;
                }
                Assignee assignee = (Assignee) obj;
                return this.name.equals(assignee.name) && Intrinsics.areEqual(this.label, assignee.label) && this.avatarMonogram.equals(assignee.avatarMonogram);
            }

            public final int hashCode() {
                return this.avatarMonogram.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.label);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Assignee(name=", this.name, ", label=", this.label, ", avatarMonogram="), this.avatarMonogram, ")");
            }
        }

        public final class Details {
            public final String job;
            public final String location;
            public final String passcode;

            public Details(String str, String str2, String str3) {
                this.location = str;
                this.job = str2;
                this.passcode = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Details)) {
                    return false;
                }
                Details details = (Details) obj;
                return Intrinsics.areEqual(this.location, details.location) && Intrinsics.areEqual(this.job, details.job) && Intrinsics.areEqual(this.passcode, details.passcode);
            }

            public final int hashCode() {
                String str = this.location;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.job;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 961;
                String str3 = this.passcode;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Details(location=", this.location, ", job=", this.job, ", breaks=null, passcode="), this.passcode, ")");
            }
        }

        public final class Header {
            public final String dayLabel;
            public final String merchantName;
            public final SellerCardViewModel sellerCardViewModel;
            public final String shiftTimeText;

            public Header(SellerCardViewModel sellerCardViewModel, String str, String str2, String str3) {
                str.getClass();
                this.dayLabel = str;
                this.shiftTimeText = str2;
                this.merchantName = str3;
                this.sellerCardViewModel = sellerCardViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Header)) {
                    return false;
                }
                Header header = (Header) obj;
                return Intrinsics.areEqual(this.dayLabel, header.dayLabel) && this.shiftTimeText.equals(header.shiftTimeText) && this.merchantName.equals(header.merchantName) && this.sellerCardViewModel.equals(header.sellerCardViewModel);
            }

            public final int hashCode() {
                return this.sellerCardViewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.dayLabel.hashCode() * 31, 31, this.shiftTimeText), 31, this.merchantName);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Header(dayLabel=", this.dayLabel, ", shiftTimeText=", this.shiftTimeText, ", merchantName=");
                m.append(this.merchantName);
                m.append(", sellerCardViewModel=");
                m.append(this.sellerCardViewModel);
                m.append(")");
                return m.toString();
            }
        }

        public final class Note {
            public final String text;

            public Note(String str) {
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Note) && this.text.equals(((Note) obj).text);
            }

            public final int hashCode() {
                return this.text.hashCode() * 31;
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Note(text=", this.text, ", author=null)");
            }
        }

        public Loaded(Header header, Assignee assignee, Details details, Note note, boolean z, boolean z2) {
            this.header = header;
            this.assignee = assignee;
            this.details = details;
            this.note = note;
            this.showClockInButton = z;
            this.isClockInEnabled = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.header.equals(loaded.header) && Intrinsics.areEqual(this.assignee, loaded.assignee) && this.details.equals(loaded.details) && Intrinsics.areEqual(this.note, loaded.note) && this.showClockInButton == loaded.showClockInButton && this.isClockInEnabled == loaded.isClockInEnabled;
        }

        public final int hashCode() {
            int hashCode = this.header.hashCode() * 31;
            Assignee assignee = this.assignee;
            int hashCode2 = (this.details.hashCode() + ((hashCode + (assignee == null ? 0 : assignee.hashCode())) * 31)) * 31;
            Note note = this.note;
            return Boolean.hashCode(this.isClockInEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (note != null ? note.hashCode() : 0)) * 31, 31, this.showClockInButton);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(header=");
            sb.append(this.header);
            sb.append(", assignee=");
            sb.append(this.assignee);
            sb.append(", details=");
            sb.append(this.details);
            sb.append(", note=");
            sb.append(this.note);
            sb.append(", showClockInButton=");
            return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.showClockInButton, ", isClockInEnabled=", this.isClockInEnabled, ")");
        }
    }

    public final class Loading implements ShiftDetailViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1911128947;
        }

        public final String toString() {
            return "Loading";
        }
    }
}

package com.squareup.cash.support.chat.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ChatAttachmentViewModel {

    public final class FileAttachmentViewModel extends ChatAttachmentViewModel {
        public final String fileTypeDescription;
        public final String name;
        public final boolean showCloseButton;
        public final String uri;

        public FileAttachmentViewModel(String str, String str2, String str3, boolean z) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.uri = str;
            this.name = str2;
            this.fileTypeDescription = str3;
            this.showCloseButton = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileAttachmentViewModel)) {
                return false;
            }
            FileAttachmentViewModel fileAttachmentViewModel = (FileAttachmentViewModel) obj;
            return Intrinsics.areEqual(this.uri, fileAttachmentViewModel.uri) && Intrinsics.areEqual(this.name, fileAttachmentViewModel.name) && Intrinsics.areEqual(this.fileTypeDescription, fileAttachmentViewModel.fileTypeDescription) && this.showCloseButton == fileAttachmentViewModel.showCloseButton;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showCloseButton) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.uri.hashCode() * 31, 31, this.name), 31, this.fileTypeDescription);
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FileAttachmentViewModel(uri=", this.uri, ", name=", this.name, ", fileTypeDescription="), this.fileTypeDescription, ", showCloseButton=", this.showCloseButton, ")");
        }
    }

    public final class ImageAttachmentViewModel extends ChatAttachmentViewModel {
        public final String uri;

        public ImageAttachmentViewModel(String str) {
            str.getClass();
            this.uri = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ImageAttachmentViewModel) && Intrinsics.areEqual(this.uri, ((ImageAttachmentViewModel) obj).uri);
        }

        public final int hashCode() {
            return this.uri.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ImageAttachmentViewModel(uri=", this.uri, ")");
        }
    }
}

package com.squareup.cash.transfers.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InstrumentLinkingOptionsViewModel {
    public final String body;
    public final String header;
    public final ArrayList instrumentLinkOptions;

    public final class Option {
        public final InstrumentLinkingOptionsViewEvent instrumentViewEvent;
        public final InstrumentCellViewModel instrumentViewModel;

        public Option(InstrumentCellViewModel instrumentCellViewModel, InstrumentLinkingOptionsViewEvent instrumentLinkingOptionsViewEvent) {
            this.instrumentViewModel = instrumentCellViewModel;
            this.instrumentViewEvent = instrumentLinkingOptionsViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return this.instrumentViewModel.equals(option.instrumentViewModel) && this.instrumentViewEvent.equals(option.instrumentViewEvent);
        }

        public final int hashCode() {
            return this.instrumentViewEvent.hashCode() + (this.instrumentViewModel.hashCode() * 31);
        }

        public final String toString() {
            return "Option(instrumentViewModel=" + this.instrumentViewModel + ", instrumentViewEvent=" + this.instrumentViewEvent + ")";
        }
    }

    public InstrumentLinkingOptionsViewModel(String str, String str2, ArrayList arrayList) {
        str.getClass();
        this.header = str;
        this.body = str2;
        this.instrumentLinkOptions = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkingOptionsViewModel)) {
            return false;
        }
        InstrumentLinkingOptionsViewModel instrumentLinkingOptionsViewModel = (InstrumentLinkingOptionsViewModel) obj;
        return Intrinsics.areEqual(this.header, instrumentLinkingOptionsViewModel.header) && Intrinsics.areEqual(this.body, instrumentLinkingOptionsViewModel.body) && this.instrumentLinkOptions.equals(instrumentLinkingOptionsViewModel.instrumentLinkOptions);
    }

    public final int hashCode() {
        int hashCode = this.header.hashCode() * 31;
        String str = this.body;
        return this.instrumentLinkOptions.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentLinkingOptionsViewModel(header=", this.header, ", body=", this.body, ", instrumentLinkOptions="), this.instrumentLinkOptions);
    }
}

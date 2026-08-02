package com.withpersona.sdk2.inquiry.shared.inquiryTheme;

import androidx.lifecycle.SavedStateHandle;
import kotlinx.coroutines.flow.MutableStateFlow;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class InquiryThemeManager {
    public final MutableStateFlow themeFlow;

    public InquiryThemeManager(SavedStateHandle savedStateHandle) {
        savedStateHandle.getClass();
        InquiryTheme inquiryTheme = InquiryTheme.Default;
        if (savedStateHandle.liveDatas.containsKey("inquiry_theme")) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) "StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key 'inquiry_theme', but not both.");
            throw null;
        }
        this.themeFlow = savedStateHandle.impl.getMutableStateFlow(inquiryTheme, "inquiry_theme");
    }
}

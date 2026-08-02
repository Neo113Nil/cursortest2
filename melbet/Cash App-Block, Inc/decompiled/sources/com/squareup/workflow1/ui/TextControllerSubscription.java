package com.squareup.workflow1.ui;

import kotlinx.coroutines.Job;

/* loaded from: classes8.dex */
public final class TextControllerSubscription {
    public final TextControllerImpl controller;
    public final Job subscription;

    public TextControllerSubscription(TextControllerImpl textControllerImpl, Job job) {
        textControllerImpl.getClass();
        this.controller = textControllerImpl;
        this.subscription = job;
    }
}

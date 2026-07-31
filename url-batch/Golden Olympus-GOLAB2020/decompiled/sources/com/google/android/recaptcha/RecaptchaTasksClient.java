package com.google.android.recaptcha;

import com.google.android.gms.tasks.Task;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public interface RecaptchaTasksClient {
    Task<String> executeTask(RecaptchaAction recaptchaAction);

    Task<String> executeTask(RecaptchaAction recaptchaAction, long j4);
}

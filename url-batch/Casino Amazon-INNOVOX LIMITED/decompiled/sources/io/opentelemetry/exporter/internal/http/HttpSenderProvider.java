package io.opentelemetry.exporter.internal.http;

/* loaded from: classes3.dex */
public interface HttpSenderProvider {
    HttpSender createSender(HttpSenderConfig httpSenderConfig);
}

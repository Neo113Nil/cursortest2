package io.opentelemetry.exporter.internal.metrics;

import io.opentelemetry.api.common.Attributes;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface ExporterMetrics {
    Recording startRecordingExport(int i);

    public static abstract class Recording {
        private boolean alreadyEnded = false;

        protected abstract void doFinish(@Nullable String str, Attributes attributes);

        protected Recording() {
        }

        public final void finishSuccessful(Attributes attributes) {
            ensureEndedOnce();
            doFinish(null, attributes);
        }

        public final void finishFailed(String str, Attributes attributes) {
            ensureEndedOnce();
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("The export failed but no failure reason was provided");
            }
            doFinish(str, attributes);
        }

        private void ensureEndedOnce() {
            if (this.alreadyEnded) {
                throw new IllegalStateException("Recording already ended");
            }
            this.alreadyEnded = true;
        }
    }
}

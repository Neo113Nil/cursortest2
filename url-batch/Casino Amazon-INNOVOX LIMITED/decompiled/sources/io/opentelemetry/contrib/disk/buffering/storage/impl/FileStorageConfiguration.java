package io.opentelemetry.contrib.disk.buffering.storage.impl;

import io.opentelemetry.contrib.disk.buffering.storage.impl.AutoValue_FileStorageConfiguration;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class FileStorageConfiguration {
    public abstract long getMaxFileAgeForReadMillis();

    public abstract long getMaxFileAgeForWriteMillis();

    public abstract int getMaxFileSize();

    public abstract int getMaxFolderSize();

    public abstract long getMinFileAgeForReadMillis();

    public static FileStorageConfiguration getDefault() {
        return builder().build();
    }

    public static Builder builder() {
        return new AutoValue_FileStorageConfiguration.Builder().setMaxFileSize(1048576).setMaxFolderSize(10485760).setMaxFileAgeForWriteMillis(TimeUnit.SECONDS.toMillis(30L)).setMinFileAgeForReadMillis(TimeUnit.SECONDS.toMillis(33L)).setMaxFileAgeForReadMillis(TimeUnit.HOURS.toMillis(18L));
    }

    public static abstract class Builder {
        abstract FileStorageConfiguration autoBuild();

        public abstract Builder setMaxFileAgeForReadMillis(long j);

        public abstract Builder setMaxFileAgeForWriteMillis(long j);

        public abstract Builder setMaxFileSize(int i);

        public abstract Builder setMaxFolderSize(int i);

        public abstract Builder setMinFileAgeForReadMillis(long j);

        public final FileStorageConfiguration build() {
            FileStorageConfiguration autoBuild = autoBuild();
            if (autoBuild.getMinFileAgeForReadMillis() > autoBuild.getMaxFileAgeForWriteMillis()) {
                return autoBuild;
            }
            throw new IllegalArgumentException("The configured max file age for writing must be lower than the configured min file age for reading");
        }
    }
}

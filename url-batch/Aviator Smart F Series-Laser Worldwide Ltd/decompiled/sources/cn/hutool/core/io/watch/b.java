package cn.hutool.core.io.watch;

import java.nio.file.Path;
import java.nio.file.WatchEvent;

/* loaded from: classes.dex */
public interface b {
    void doAction(WatchEvent<?> watchEvent, Path path);
}

package cn.hutool.core.lang;

import cn.hutool.core.exceptions.UtilException;
import java.lang.management.ManagementFactory;

/* loaded from: classes.dex */
public enum Pid {
    INSTANCE;

    private final int pid = getPid();

    Pid() {
    }

    private static int getPid() {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        if (cn.hutool.core.text.l.isBlank(name)) {
            throw new UtilException("Process name is blank!");
        }
        int indexOf = name.indexOf(64);
        return indexOf > 0 ? Integer.parseInt(name.substring(0, indexOf)) : name.hashCode();
    }

    public int get() {
        return this.pid;
    }
}

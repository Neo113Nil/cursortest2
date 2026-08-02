package com.withpersona.sdk2.inquiry.appdomethreatevents;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes9.dex */
public abstract class ThreatEventState {
    public static final List knownThreatEventNames = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"RootedDevice", "DebuggerThreatDetected", "AppIsDebuggable", "AppIntegrityError", "EmulatorFound", "GoogleEmulatorDetected", "MagiskManagerDetected", "FridaDetected", "FridaCustomDetected", "DetectUnlockedBootloader", "KernelSUDetected", "HookFrameworkDetected", "OsRemountDetected", "FridaAttachDetected", "FridaSpawnDetected", "ZygiskDetected", "DetectCustomRom"});
}

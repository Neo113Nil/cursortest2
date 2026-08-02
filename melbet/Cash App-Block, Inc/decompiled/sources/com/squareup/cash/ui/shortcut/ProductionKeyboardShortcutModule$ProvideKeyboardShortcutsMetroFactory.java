package com.squareup.cash.ui.shortcut;

import androidx.navigation.compose.NavHostKt;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class ProductionKeyboardShortcutModule$ProvideKeyboardShortcutsMetroFactory implements Factory {
    public static final ProductionKeyboardShortcutModule$ProvideKeyboardShortcutsMetroFactory INSTANCE = new ProductionKeyboardShortcutModule$ProvideKeyboardShortcutsMetroFactory();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return NavHostKt.provideKeyboardShortcuts();
    }
}

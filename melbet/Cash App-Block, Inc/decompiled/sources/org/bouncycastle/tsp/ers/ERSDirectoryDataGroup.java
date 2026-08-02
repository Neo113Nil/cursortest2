package org.bouncycastle.tsp.ers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class ERSDirectoryDataGroup extends ERSDataGroup {
    public ERSDirectoryDataGroup(File file) {
        super(buildGroup(file));
    }

    private static List<ERSData> buildGroup(File file) {
        ERSCachingData eRSFileData;
        if (!file.isDirectory()) {
            a$$ExternalSyntheticBUOutline0.m$3("file reference does not refer to directory");
            return null;
        }
        File[] listFiles = file.listFiles();
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (int i = 0; i != listFiles.length; i++) {
            if (!listFiles[i].isDirectory()) {
                eRSFileData = new ERSFileData(listFiles[i]);
            } else if (listFiles[i].listFiles().length != 0) {
                eRSFileData = new ERSDirectoryDataGroup(listFiles[i]);
            }
            arrayList.add(eRSFileData);
        }
        return arrayList;
    }

    public List<ERSFileData> getFiles() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != this.dataObjects.size(); i++) {
            if (this.dataObjects.get(i) instanceof ERSFileData) {
                arrayList.add((ERSFileData) this.dataObjects.get(i));
            }
        }
        return arrayList;
    }

    public List<ERSDirectoryDataGroup> getSubdirectories() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != this.dataObjects.size(); i++) {
            if (this.dataObjects.get(i) instanceof ERSDirectoryDataGroup) {
                arrayList.add((ERSDirectoryDataGroup) this.dataObjects.get(i));
            }
        }
        return arrayList;
    }
}

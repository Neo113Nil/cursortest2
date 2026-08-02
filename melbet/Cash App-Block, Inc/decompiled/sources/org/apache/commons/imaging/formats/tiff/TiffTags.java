package org.apache.commons.imaging.formats.tiff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants;
import org.apache.commons.imaging.formats.tiff.constants.AdobePhotoshopTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.AliasSketchbookProTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.DngTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.GdalLibraryTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.HylaFaxTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants;
import org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.WangTagConstants;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;

/* loaded from: classes9.dex */
final class TiffTags {
    private static final List<TagInfo> ALL_TAGS;
    private static final Map<Integer, List<TagInfo>> ALL_TAG_MAP;
    private static final Map<Integer, Integer> TAG_COUNTS;

    static {
        List<TagInfo> makeMergedTagList = makeMergedTagList();
        ALL_TAGS = makeMergedTagList;
        ALL_TAG_MAP = makeTagMap(makeMergedTagList);
        TAG_COUNTS = countTags(makeMergedTagList);
    }

    private TiffTags() {
    }

    private static Map<Integer, Integer> countTags(List<TagInfo> list) {
        HashMap hashMap = new HashMap();
        for (TagInfo tagInfo : list) {
            Integer num = (Integer) hashMap.get(Integer.valueOf(tagInfo.tag));
            int i = tagInfo.tag;
            if (num == null) {
                hashMap.put(Integer.valueOf(i), 1);
            } else {
                hashMap.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
            }
        }
        return hashMap;
    }

    private static TagInfo getTag(int i, List<TagInfo> list) {
        if (list.isEmpty()) {
            return null;
        }
        for (TagInfo tagInfo : list) {
            TiffDirectoryType tiffDirectoryType = tagInfo.directoryType;
            if (tiffDirectoryType != TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN && i == tiffDirectoryType.directoryType) {
                return tagInfo;
            }
        }
        for (TagInfo tagInfo2 : list) {
            TiffDirectoryType tiffDirectoryType2 = tagInfo2.directoryType;
            if (tiffDirectoryType2 != TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN && ((i >= 0 && tiffDirectoryType2.isImageDirectory()) || (i < 0 && !tagInfo2.directoryType.isImageDirectory()))) {
                return tagInfo2;
            }
        }
        for (TagInfo tagInfo3 : list) {
            if (tagInfo3.directoryType == TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN) {
                return tagInfo3;
            }
        }
        return TiffTagConstants.TIFF_TAG_UNKNOWN;
    }

    public static Integer getTagCount(int i) {
        return TAG_COUNTS.get(Integer.valueOf(i));
    }

    private static List<TagInfo> makeMergedTagList() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(AdobePageMaker6TagConstants.ALL_ADOBE_PAGEMAKER_6_TAGS);
        arrayList.addAll(AdobePhotoshopTagConstants.ALL_ADOBE_PHOTOSHOP_TAGS);
        arrayList.addAll(AliasSketchbookProTagConstants.ALL_ALIAS_SKETCHBOOK_PRO_TAGS);
        arrayList.addAll(DcfTagConstants.ALL_DCF_TAGS);
        arrayList.addAll(DngTagConstants.ALL_DNG_TAGS);
        arrayList.addAll(ExifTagConstants.ALL_EXIF_TAGS);
        arrayList.addAll(GeoTiffTagConstants.ALL_GEO_TIFF_TAGS);
        arrayList.addAll(GdalLibraryTagConstants.ALL_GDAL_LIBRARY_TAGS);
        arrayList.addAll(GpsTagConstants.ALL_GPS_TAGS);
        arrayList.addAll(HylaFaxTagConstants.ALL_HYLAFAX_TAGS);
        arrayList.addAll(MicrosoftTagConstants.ALL_MICROSOFT_TAGS);
        arrayList.addAll(MicrosoftHdPhotoTagConstants.ALL_MICROSOFT_HD_PHOTO_TAGS);
        arrayList.addAll(MolecularDynamicsGelTagConstants.ALL_MOLECULAR_DYNAMICS_GEL_TAGS);
        arrayList.addAll(OceScanjobTagConstants.ALL_OCE_SCANJOB_TAGS);
        arrayList.addAll(Rfc2301TagConstants.ALL_RFC_2301_TAGS);
        arrayList.addAll(Tiff4TagConstants.ALL_TIFF_4_TAGS);
        arrayList.addAll(TiffEpTagConstants.ALL_TIFF_EP_TAGS);
        arrayList.addAll(TiffTagConstants.ALL_TIFF_TAGS);
        arrayList.addAll(WangTagConstants.ALL_WANG_TAGS);
        return Collections.unmodifiableList(arrayList);
    }

    private static Map<Integer, List<TagInfo>> makeTagMap(List<TagInfo> list) {
        HashMap hashMap = new HashMap();
        for (TagInfo tagInfo : list) {
            List list2 = (List) hashMap.get(Integer.valueOf(tagInfo.tag));
            if (list2 == null) {
                list2 = new ArrayList();
                hashMap.put(Integer.valueOf(tagInfo.tag), list2);
            }
            list2.add(tagInfo);
        }
        return hashMap;
    }

    public static TagInfo getTag(int i, int i2) {
        List<TagInfo> list = ALL_TAG_MAP.get(Integer.valueOf(i2));
        if (list == null) {
            return TiffTagConstants.TIFF_TAG_UNKNOWN;
        }
        return getTag(i, list);
    }
}
